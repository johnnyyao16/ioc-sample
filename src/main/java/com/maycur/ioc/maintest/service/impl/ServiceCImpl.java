package com.maycur.ioc.maintest.service.impl;

import com.maycur.ioc.annotation.Inject;
import com.maycur.ioc.maintest.service.ServiceB;
import com.maycur.ioc.maintest.service.ServiceC;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ServiceCImpl implements ServiceC {

    private static Logger logger = LoggerFactory.getLogger(ServiceCImpl.class);

    @Inject private ServiceB serviceB;

    @Override
    public void sayHello() {
        logger.info("This is Service C, say hello!");
        logger.info("In Service C, invoke Service B to say world");
        serviceB.sayWorld();
    }

    @Override
    public void sayWorld() {
        logger.info("This is Service C, say world!");
    }
}
