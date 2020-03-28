package com.tianyu.bookappapi;

public class Test {
    public static void main(String[] args) {
        /**
        String []letter={"a","B","C","d","E","f","g","h","I","J"};
        int a = (int)(System.currentTimeMillis()/1000);
        String time=String.valueOf(a);
        System.out.println(time);
        String key="";
        for (int i = 0; i <time.length() ; i++) {
            int d=Integer.parseInt(String.valueOf(time.charAt(i)));
            key+=letter[d];
        }
        System.out.println(key);
        String jiemi="";
        for (int i = 0; i <key.length() ; i++) {
            for (int j = 0; j <letter.length ; j++) {
                if (letter[j].equals(String.valueOf(key.charAt(i)))){
                    jiemi+=String.valueOf(j);
                }
            }
        }

        System.out.println(Integer.parseInt(jiemi));
        System.out.println((int)(System.currentTimeMillis()/1000));
         */
        System.out.println((Integer.valueOf(TestEnum.Test3.getValue())-1));
        System.out.println(TestEnum.values().toString());
    }
}
