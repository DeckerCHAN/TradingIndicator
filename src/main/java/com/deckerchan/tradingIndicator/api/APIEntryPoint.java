package com.deckerchan.tradingIndicator.api;


import core.Engine;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class APIEntryPoint extends HttpServlet {

    private Engine engine;

    public APIEntryPoint() {
        super();
        this.engine = Engine.getEngine();
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
        super.doPost(req, resp);
    }
}
