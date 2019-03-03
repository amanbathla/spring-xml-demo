package com.stackRoute;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Movie implements ApplicationContextAware, BeanNameAware , BeanFactoryAware {

    //Declaration
    Actor actor1;



    Actor actor2;
    Actor actor3;
    private ApplicationContext context = null;
    private BeanFactory beanFactory;
    Movie(){

    }
    public Movie( Actor actor1, Actor actor2, Actor actor3) {

        this.actor1 = actor1;
        this.actor2 = actor2;
        this.actor3 = actor3;
    }


    // Setter

    @Override
    public String toString() {
        return "Movie{" +
                "actor1=" + actor1 +
                ", actor2=" + actor2 +
                ", actor3=" + actor3 +
                '}';
    }



    public void setActor2(Actor actor2) {
        this.actor2 = actor2;
    }
    public void setActor1(Actor actor1) {
        this.actor1 = actor1;
    }

    public void setActor3(Actor actor3) {
        this.actor3 = actor3;
    }

    //To String Method


    // My methods for bean factory Aware


    public void getMyBeanName() {
        Movie myBeanName = beanFactory.getBean(Movie.class);
        System.out.println(beanFactory.isSingleton("Movie1"));
        System.out.println(beanFactory.isPrototype("Movie1"));
    }


    //Application Aware Methods

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.context = context;

    }


    // bean name aware to let us know which bean is currently being Processed

    public void setBeanName(String beanName) {
        System.out.println("Bean is :"+ beanName);
    }

    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        this.beanFactory = beanFactory;
        System.out.println(beanFactory.getClass().getName());
    }
}
