package ru.otus.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import quoters.TerminatorQuoter;

public class Main {
    // 1. BeanDefinitionDocumentReader - parses context for bean definitions;
    // 2. BeanFactory:
    //     - retrieves BeanPostProcessor-s from bean definitions for further usage;
    //     - creates bean according to the configuration (first phase);
    //     - calls 'init()' method of the bean;
    //     - processes bean with BeanPostProcessor (second phase);
    // 3. BeanPostProcessor - processes beans before publication.
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:context.xml");
        context.getBean(TerminatorQuoter.class).sayQuote();
    }
}

