package com.maycur.ioc.bean;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class BeanDefinition {
    private String beanName;
    private String className;
    private String interfaceName;
    private Object[] constructorArgs;
}
