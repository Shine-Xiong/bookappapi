package com.tianyu.bookappapi;

public enum TestEnum {
    SYSTEM("草你妈"),
    Test2("1"),
    Test3("3");

    private String value;

    TestEnum(String value){
        this.value=value;
    }
    public String getValue(){
        return value;
    }

}
