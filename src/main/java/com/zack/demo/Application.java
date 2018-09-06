package com.zack.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Zack
 * @date 2018/9/6
 */
public class Application {
    public static void main(String[] args) {
        // 加载xml配置
        ApplicationContext context =
                new ClassPathXmlApplicationContext("classpath:application.xml");

        // IOC获取Bean
        TestBeanService testBeanService = context.getBean(TestBeanService.class);

        System.out.println(testBeanService.getBean());
    }
}
