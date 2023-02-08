package ru.otus.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import quoters.TerminatorQuoter;

public class Main {
    // 1. BeanDefinitionBuilder - scans context.
    // 2. BeanFactory - creates instances.
    // 3. BeanPostProcessor - processes beans before publication.
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:context.xml");
        context.getBean(TerminatorQuoter.class).sayQuote();
    }
}

