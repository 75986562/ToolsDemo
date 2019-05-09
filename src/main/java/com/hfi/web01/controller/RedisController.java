package com.hfi.web01.controller;

import com.hfi.web01.service.TestService;
import com.hfi.web01.util.SequenceUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @ClassName RedisController
 * @Auther XiaoHua
 * @Date 2019/5/9 22:45
 * @Description
 * @Version 0.0.1
 */
@RestController
@RequestMapping("redis")
public class RedisController {
    @Autowired
    private TestService testService;
    @RequestMapping(value = "/getSequence")
    public String getSequence(){
        String currentDate = new SimpleDateFormat("yyyyMMdd").format(new Date());
        Long num = testService.getIncrementNum("demo_get_the_new_" + "test3_"+currentDate);
        String flowCode = SequenceUtils.getSequence(num);
        System.out.println("流水号: " + flowCode);
        return "ok";
    }
}
