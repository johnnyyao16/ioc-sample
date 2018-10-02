package com.maycur.ioc.maintest.service.impl;

import com.maycur.ioc.annotation.Inject;
import com.maycur.ioc.maintest.service.ServiceA;
import com.maycur.ioc.maintest.service.ServiceB;
import com.maycur.ioc.maintest.service.ServiceC;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ServiceAImpl implements ServiceA {
    private static Logger logger = LoggerFactory.getLogger(ServiceAImpl.class);

    @Inject private ServiceB serviceB;
    @Inject private ServiceC serviceC;

    @Override
    public void sayHello() {
        logger.info("This is Service A, say hello!");
        logger.info("Invoke service B to say hello");
        serviceB.sayHello();
        logger.info("Invoke service C to say hello");
        serviceC.sayHello();
    }
}
