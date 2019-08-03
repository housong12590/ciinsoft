package com.ciin.soft.utils;

public class StringUtils {

    public static boolean isEmpyt(CharSequence text) {
        return text == null || text.length() == 0;
    }

    public static boolean isNotEmpty(CharSequence text) {
        return !isEmpyt(text);
    }

    public static String emptyToDefault(String text, String defValue) {
        if (isEmpyt(text)) {
            return defValue;
        }
        return text;
    }

    public static String maxLength(String value, int length) {
        return null;
    }


}
