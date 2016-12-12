package com.deckerchan.tradingIndicator.api;


import com.deckerchan.tradingIndicator.PresetConfiguration;
import com.deckerchan.tradingIndicator.protocol.ErrorResult;
import com.deckerchan.tradingIndicator.protocol.Result;
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

        String apiPath;
        APIBase apiBase;

        try {
            apiPath = requestURI.substring(requestURI.lastIndexOf(PresetConfiguration.API_URL_PREFIX));
            apiBase = APIManager.getManager().getAPI(apiPath);
        } catch (Exception ex) {

            result = new ErrorResult("Invalid path! Api not found.", ex);
            resp.getWriter().write(gson.toJson(result));
            return;
        }



        try {
            apiBase.execute(req.getParameterMap());
            result = apiBase.getResult();
        } catch (Exception ex) {

            result = new ErrorResult("Error occurred during execution.", ex);
            resp.getWriter().write(gson.toJson(result));
            return;
        }

        resp.getWriter().write(gson.toJson(result));


    }
}
