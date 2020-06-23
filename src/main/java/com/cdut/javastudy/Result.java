package com.cdut.javastudy;

public class Result {

    private int code;
    private String msg;

    public Result(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }
    public Result(int code) {
        this.code = code;
        this.msg = "";
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

}
