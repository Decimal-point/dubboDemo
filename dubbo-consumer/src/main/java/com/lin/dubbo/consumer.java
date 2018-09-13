package com.lin.dubbo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class consumer {
    public static void main(String[] args){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("consumer.xml");
        context.start();
        System.out.println("context start!");
        ApiService apiService = context.getBean(ApiService.class);
        System.out.println("apiService");
        apiService.getPession(1L);
    }
}
