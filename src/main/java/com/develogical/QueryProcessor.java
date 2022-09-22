package com.develogical;

public class QueryProcessor {

    public String process(String query) {
        if (query.toLowerCase().contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        }
        if (query.toLowerCase().contains("name")) {
            return "grass";
        }
        if (query.toLowerCase().contains("uwu")) {
            return "HELLO, FELLOW WEEB!! 0W0";
        }
        if (query.toLowerCase().contains("plus")) {
            String[] strs = query.split(" ");
            for (int i = 0; i < strs.length; i++) {
                if (strs[i].toLowerCase().equals("plus")) {
                    int int1 = Integer.parseInt(strs[i-1]);
                    int int2 = Integer.parseInt(strs[i+1]);
                    int sum = int1+int2;
                    return Integer.toString(sum);
                }
            }
        }
        return "";
    }
}
