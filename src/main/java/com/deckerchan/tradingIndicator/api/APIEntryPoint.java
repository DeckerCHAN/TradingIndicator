package com.deckerchan.tradingIndicator.api;


import com.deckerchan.tradingIndicator.MagicStrings;
import com.deckerchan.tradingIndicator.entities.protocol.Result;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class APIEntryPoint extends HttpServlet {

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
        super.doGet(req, resp);
        //TODO:Customer not support message.
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String requestURI = req.getRequestURI();
        Result result = null;
        try {
            String apiPath = requestURI.substring(requestURI.lastIndexOf(MagicStrings.API_URL_PREFIX));
            APIManager.getManager().getAPI(apiPath);
        } catch (Exception ex) {
            
        }

    }
}
