package com.crosslab.blockchain.common.utils;

public class SubStringUtils {

    public static String subJson(String json) {
        String[] srr = json.split("\\{");
        return  "{"+ srr[1];

    }


}
