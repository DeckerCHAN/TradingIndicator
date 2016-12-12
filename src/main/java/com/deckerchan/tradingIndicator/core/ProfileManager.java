package com.deckerchan.tradingIndicator.core;

import com.deckerchan.tradingIndicator.entities.account.User;
import com.deckerchan.tradingIndicator.entities.account.UserType;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.UUID;

/**
 * Created by deckerchan on 24/09/16.
 * This file may contains code with copyright.
 */
public final class ProfileManager {

    private ArrayList<User> activeUserList;

    public ProfileManager() {
        this.activeUserList = new ArrayList<>();
    }

    public ArrayList<User> getActiveUserList() {
        return activeUserList;
    }

    private void setActiveUserList(ArrayList<User> activeUserList) {
        this.activeUserList = activeUserList;
    }

    public User createNewUser(String name, String pwdmd5, UserType type) {
        throw new NotImplementedException();
    }

    public UUID login(String username, String password) {

    }

    public void checkAuthority() {

    }

    public void flushUser() {
        ArrayList<User> oldList = this.getActiveUserList();
        ArrayList<User> newList = new ArrayList<>();

        for (User user : oldList) {
            //TODO:remove time out users
        }
    }

}
