package com.develogical;

public class QueryProcessor {

    public boolean isSquare(int x) {
        double sqrt = Math.sqrt(x);
        return ((sqrt - Math.floor(sqrt)) == 0); 
    }

    public boolean isCube(int x) {
        double cbrt = Math.cbrt(x);
        return ((cbrt - Math.floor(cbrt)) == 0); 
    }

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
        if (query.toLowerCase().contains("largest:")) {
            String[] strs = query.split(" ");
            boolean hi = false;
            int max = Integer.MIN_VALUE;
            int i;
            for (i = 0; i < strs.length; i++) {
                if (hi) {
                    String intString = strs[i].split(",")[0];
                    int n = Integer.parseInt(intString);
                    max = Math.max(max, n);
                }
                if (strs[i].toLowerCase().equals("largest:")) {
                    hi = true;
                }
            }
            return Integer.toString(max);
        }
        if (query.toLowerCase().contains("cube:")) {
            String[] strs = query.split(" ");
            boolean hi = false;
            int i;
            for (i = 0; i < strs.length; i++) {
                if (hi) {
                    String intString = strs[i].split(",")[0];
                    int n = Integer.parseInt(intString);
                    if (isSquare(n) && isCube(n)) return Integer.toString(n);
                }
                if (strs[i].toLowerCase().equals("cube:")) {
                    hi = true;
                }
            }
        }
        if (query.toLowerCase().contains("multiplied")) {
            String[] strs = query.split(" ");
            for (int i = 0; i < strs.length; i++) {
                if (strs[i].toLowerCase().equals("by")) {
                    int int1 = Integer.parseInt(strs[i-2]);
                    int int2 = Integer.parseInt(strs[i+1]);
                    int prod = int1*int2;
                    return Integer.toString(prod);
                }
            }
        }
        return "";
    }
}
