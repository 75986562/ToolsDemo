package com.hfi.web01.exception;

/**
 * @ClassName RedisException
 * @Auther XiaoHua
 * @Date 2019/5/9 22:46
 * @Description
 * @Version 0.0.1
 */
public class RedisException extends Exception {
    public RedisException(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public RedisException(Throwable cause, String code, String msg) {
        super(cause);
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
