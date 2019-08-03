package com.ciin.soft.utils;

import com.google.gson.Gson;

public class JSONUtils {

    private static Gson gson = new Gson();

    public static <T> T toBean(String json, Class<T> cls) {
        return gson.fromJson(json, cls);
    }

    public static String toJson(Object obj) {
        return gson.toJson(obj);
    }
}
