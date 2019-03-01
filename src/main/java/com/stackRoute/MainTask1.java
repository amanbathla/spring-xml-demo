package com.stackRoute;


import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.beans.factory.support.*;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;



public class MainTask1 {


    public static void main(String[] args) {


        // Using Application context
      ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
      //  ((ClassPathXmlApplicationContext) context).registerShutdownHook();
        Movie movie = (Movie) context.getBean("Movie1");
        System.out.println(movie);


        ApplicationContext context1 = new ClassPathXmlApplicationContext("spring.xml");
        //  ((ClassPathXmlApplicationContext) context).registerShutdownHook();
        Movie movie1 = (Movie) context.getBean("Movie2");
        System.out.println(movie1);

        System.out.println(movie == movie1);

        // Using xml bean factory

//        Resource resource = new ClassPathResource("spring.xml");
//        BeanFactory factory = new XmlBeanFactory(resource);
//
//
//        System.out.println(factory.getBean("Movie"));

//         Using Bean Fcatory

    }
}

