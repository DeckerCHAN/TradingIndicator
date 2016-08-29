package com.deckerchan.tradingIndicator.utils;

import java.io.InputStream;
import java.net.URL;

public class AchieveFileUtils {
    public static URL getFileFromAchieve(String path){
       return AchieveFileUtils.class.getClassLoader().getResource(path);
    }

    public static InputStream getStreamFromAchieve(String path){
        return AchieveFileUtils.class.getClassLoader().getResourceAsStream(path);
    }
}
