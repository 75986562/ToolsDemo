package com.hfi.web01.service;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.support.atomic.RedisAtomicLong;
import org.springframework.stereotype.Service;

/**
 * @ClassName TestService
 * @Auther XiaoHua
 * @Date 2019/5/9 22:51
 * @Description
 * @Version 0.0.1
 */
@Service
public class TestService {
    //这里因为有其他的template,所以名字起得不好看
    @Autowired
    RedisTemplate<String, Object> ObjectRedisTemplate;

    public Long getIncrementNum(String key) {

        // 不存在准备创建 键值对
        RedisAtomicLong entityIdCounter = new RedisAtomicLong(key,ObjectRedisTemplate.getConnectionFactory());
        Long counter = entityIdCounter.incrementAndGet();
        if ((null == counter || counter.longValue() == 1)) {// 初始设置过期时间
            System.out.println("设置过期时间为1天!");
            entityIdCounter.expire(1, TimeUnit.DAYS);// 单位天
        }
        return counter;
    }

}
