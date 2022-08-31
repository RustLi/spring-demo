package com.example.test.redis;

import com.example.test.redis.service.RedisOpService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class RedisApplicationTests {

    @Autowired
    private RedisOpService redisOpService;

    @Test
    void contextLoads() {

    }

    @Test
    void testOp() {
//        System.out.println("testOp start..");
//        redisOpService.testOp();
//        System.out.println("testOp end...");

        redisOpService.testStrOp();
    }

}
