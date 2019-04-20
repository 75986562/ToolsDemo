package com.hfi.web01.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName TraceController
 * @Auther VCC
 * @Date 2019/3/30 14:26
 * @Description
 * @Version
 */
@RestController
public class TraceController {

    @RequestMapping(value = "/check_health")
    public String check(){
        return "ok";
    }

}
