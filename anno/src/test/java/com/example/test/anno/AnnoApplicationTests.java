package com.example.test.anno;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@SpringBootTest(classes = AnnoApplication.class)
@Slf4j
@RunWith(SpringJUnit4ClassRunner.class)
class AnnoApplicationTests {

    @Test
    void contextLoads() {
        System.out.println("lwl 111....");
    }
}
