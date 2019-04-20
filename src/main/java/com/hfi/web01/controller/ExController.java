package com.hfi.web01.controller;

import com.hfi.web01.exception.MyException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName ExController
 * @Auther VCC
 * @Date 2019/4/6 17:05
 * @Description
 * @Version 0.0.1
 */
@RestController
public class ExController {
    @RequestMapping("/home/ex2")
    public String home() throws Exception {
//        throw new Exception("程序异常");
        throw new MyException("101", "自定义异常");
    }
}
