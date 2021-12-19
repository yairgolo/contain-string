package com.yair.model;

public class Contain {
    public static String containString(String a, String b){
        char[] c1 = a.toCharArray();
        char[] c2 = b.toCharArray();
        for (int i = 0; i < c1.length; i++) {
            for (int j = 0; j < c2.length; j++) {
                if (c1[i] == c2[j]){
                    return "yes";
                }
            }
        }
        return "no";
    }
}
