package com.hfi.web01.exception;

/**
 * @ClassName MyException
 * @Auther VCC
 * @Date 2019/4/6 16:57
 * @Description
 * @Version 0.0.1
 */

//spring 对于 RuntimeException 异常才会进行事务回滚。
public class MyException extends RuntimeException {

    public MyException(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    private String code;
    private String msg;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
