package com.stackRoute;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanLifecycleDemoBean implements InitializingBean, DisposableBean {


    public void afterPropertiesSet() throws Exception {
        System.out.println("Bean is Being Initialised");
    }

    public void destroy() throws Exception {
        System.out.println("Bean is Being Disposed");
    }




    // Custom Init and Custom Destroy method

    public void customInit(){
        System.out.println("custom methods for Bean init");
    }

    public void customDestroy(){
        System.out.println("custom methods for Bean Destroy");
    }
}
