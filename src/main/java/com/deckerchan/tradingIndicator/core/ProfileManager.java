package com.deckerchan.tradingIndicator.core;

import com.deckerchan.tradingIndicator.PresetConfiguration;
import com.deckerchan.tradingIndicator.entities.account.User;
import com.deckerchan.tradingIndicator.entities.account.UserType;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by deckerchan on 24/09/16.
 * This file may contains code with copyright.
 */
public final class ProfileManager {


    private HashMap<UUID, User> activeUserMap;

    public ProfileManager() {
        this.activeUserMap = new HashMap<>();
    }

    public HashMap<UUID, User> getActiveUserMap() {
        return activeUserMap;
    }

    private synchronized void setActiveUserMap(HashMap<UUID, User> activeUserMap) {
        this.activeUserMap = activeUserMap;
    }

    public User createNewUser(String name, String pwdmd5, UserType type) {
        throw new NotImplementedException();
    }

    public UUID login(String username, String password) {


        UUID tempID = UUID.randomUUID();

        User newUser = new User();

        //TODO: Retrieval newUser information.

        for(User oldUser : this.getActiveUserMap().values())
        {
            if(oldUser.getUserID().equals(newUser))
        }

        this.getActiveUserMap().put(tempID, newUser);
        return tempID;
    }

    public boolean checkAuthority(UUID userID, UserType type) {

        if (!this.getActiveUserMap().containsKey(userID)) {
            return false;
        }

        User user = this.getActiveUserMap().get(userID);

        if (type != user.getType()) {
            return false;
        }

        user.lastActiveTime = LocalDateTime.now();
        this.flushUser();

        return true;

    }

    public void flushUser() {
        HashMap<UUID, User> oldList = this.getActiveUserMap();
        HashMap<UUID, User> newList = new HashMap<>();

        for (UUID userID : oldList.keySet()) {
            if (LocalDateTime.now().minusMinutes(PresetConfiguration.USER_ACTIVE_MINUTES).isAfter(oldList.get(userID).lastActiveTime)) {
                newList.put(userID, oldList.get(userID));
            }
        }

        this.setActiveUserMap(newList);
    }

}
