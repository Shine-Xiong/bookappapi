package com.tianyu.bookappapi.utils;

public class RequestKeyUtil {
    //解析请求密匙是否符合
    public static boolean GetKey(String key){
        if (!"".equals(key)) {
            //数字对应的字母
            String[] letter = {"a", "B", "C", "d", "E", "f", "g", "h", "I", "J"};
            String parsing="";
            for (int i = 0; i <key.length() ; i++) {
                for (int j = 0; j <letter.length ; j++) {
                    if (letter[j].equals(String.valueOf(key.charAt(i)))){
                        parsing+=String.valueOf(j);
                    }
                }
            }
            int clienttime=Integer.parseInt(parsing);
            int servertime=(int)(System.currentTimeMillis()/1000);
            if ((servertime-clienttime)<60){
                return true;
            }
        }
        return false;
    }
}

