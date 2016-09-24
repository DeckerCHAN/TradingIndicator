package com.deckerchan.tradingIndicator.order;

import com.deckerchan.tradingIndicator.entities.order.Order;
import com.deckerchan.tradingIndicator.entities.account.User;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.List;

public final class OrderManager {
    private Logger logger;

    public OrderManager() {
        this.logger = LogManager.getLogger(this.getClass());
    }

    public List<Order> getOrders(User user) {
        throw new NotImplementedException();
    }

    public void createOrder(User user,Order order) {
        throw new NotImplementedException();
    }

    public void calcelOrder() {

    }
}
