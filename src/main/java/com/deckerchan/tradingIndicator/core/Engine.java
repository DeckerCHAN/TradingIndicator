package com.deckerchan.tradingIndicator.core;

import com.deckerchan.tradingIndicator.Order.OrderManager;
import com.deckerchan.tradingIndicator.utils.AchieveFileUtils;
import org.apache.commons.configuration.Configuration;
import org.apache.commons.configuration.PropertiesConfiguration;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public final class Engine {


    private static Engine _instance;
    private OrderManager orderManager;
    private Configuration configs;
    private Logger logger;

    private Engine() {
        this.orderManager = new OrderManager();
        logger = LogManager.getLogger(this.getClass());
        try {

            this.configs = new PropertiesConfiguration(AchieveFileUtils.getFileFromAchieve("/resources/config.properties"));

        } catch (Exception ex) {
            this.logger.fatal(ex.getMessage() );
        }
    }

    public static Engine getEngine() {
        if (_instance == null) {
            _instance = new Engine();
        }

        return _instance;
    }

    public OrderManager getOrderManager() {
        return orderManager;
    }

    public void setOrderManager(OrderManager orderManager) {
        this.orderManager = orderManager;
    }

    public void run() {

    }

    public void stop() {

    }
}
