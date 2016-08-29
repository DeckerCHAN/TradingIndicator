package com.deckerchan.tradingIndicator.logging;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

class LoggerFactory {

    public static Logger getLogger(Class clazz) {
        Logger logger = LogManager.getLogger(clazz);
        return null;
    }
}
