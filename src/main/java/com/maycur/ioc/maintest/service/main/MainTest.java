package com.maycur.ioc.maintest.service.main;

import com.maycur.ioc.core.ApplicationContext;
import com.maycur.ioc.maintest.service.ServiceA;

public class MainTest {

    public static void main(String args[]) {
        ApplicationContext applicationContext = new ApplicationContext("applicationBean.yaml");
        applicationContext.init();
        try {
            ServiceA serviceA = (ServiceA) applicationContext.getBean("serviceA");
            serviceA.sayHello();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
