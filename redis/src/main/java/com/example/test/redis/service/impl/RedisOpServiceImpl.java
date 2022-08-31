package com.example.test.redis.service.impl;

import com.example.test.redis.service.RedisOpService;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class RedisOpServiceImpl implements RedisOpService {

    @Resource
    private RedisTemplate<String, Object> redisTemplate;

    @Resource
    private StringRedisTemplate stringRedisTemplate;

    @Override
    public void testOp() {
        System.out.println("testOp");
        //CacheConfig 中配置redis序列化可解决key 乱码问题
        redisTemplate.opsForValue().set("lwl", "hhh");
        String value = (String) redisTemplate.opsForValue().get("lwl");
        System.out.println("testOp: value = " + value);
    }

    @Override
    public void testStrOp() {
        //stringRedisTemplate 可解决key 乱码问题
        System.out.println("testStrOp");
        stringRedisTemplate.opsForValue().set("lwl_str", "aaa");
        String value = (String) stringRedisTemplate.opsForValue().get("lwl_str");
        System.out.println("testStrOp: value = " + value);
    }
}
