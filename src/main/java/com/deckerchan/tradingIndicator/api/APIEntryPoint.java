package com.deckerchan.tradingIndicator.api;


import com.deckerchan.tradingIndicator.PresetConfiguration;
import com.deckerchan.tradingIndicator.entities.protocol.Result;
import com.google.gson.Gson;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class APIEntryPoint extends HttpServlet {
    private static Gson gson = new Gson();
    private APIManager manager;

    public APIEntryPoint() {
        super();
        this.manager = APIManager.getManager();
    }

    @Override
    public void init() throws ServletException {
        super.init();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if (PresetConfiguration.OUT_PUT_THROUGH_GET) {
            this.doPost(req, resp);
        } else {
            super.doGet(req, resp);
            //TODO:Customer not support message.
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String requestURI = req.getRequestURI();
        Result result;
        try {
            String apiPath = requestURI.substring(requestURI.lastIndexOf(PresetConfiguration.API_URL_PREFIX));
            APIBase apiBase = APIManager.getManager().getAPI(apiPath);
            result = apiBase.getResult();
        } catch (Exception ex) {
            result = new Result();
            result.setErrorMessage(ex.getMessage());
        }

        resp.getWriter().write(gson.toJson(result));


    }
}
