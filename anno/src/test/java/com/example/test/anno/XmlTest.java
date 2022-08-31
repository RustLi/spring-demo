package com.example.test.anno;

import com.example.test.anno.dao.Dog;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XmlTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        Dog dog = (Dog) context.getBean("dog");
        System.out.println(dog.getName());
    }
}
