package com.maycur.ioc.maintest.service.impl;

import com.maycur.ioc.annotation.Inject;
import com.maycur.ioc.maintest.service.ServiceB;
import com.maycur.ioc.maintest.service.ServiceC;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ServiceBImpl implements ServiceB {
    private static Logger logger = LoggerFactory.getLogger(ServiceBImpl.class);

    @Inject private ServiceC serviceC;

    @Override
    public void sayHello() {
        logger.info("This is Service B, say hello!");
        logger.info("In Service B, invoke Service C to say world");
        serviceC.sayWorld();
    }

    @Override
    public void sayWorld() {
        logger.info("This is Service B, say world!");
    }
}
