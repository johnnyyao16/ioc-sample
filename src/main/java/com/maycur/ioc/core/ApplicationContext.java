package com.maycur.ioc.core;

import com.maycur.ioc.bean.BeanDefinition;
import com.maycur.ioc.factory.BeanFactory;
import com.maycur.ioc.util.YamlUtil;

import java.io.InputStream;
import java.util.List;

public class ApplicationContext extends BeanFactory {
    private String fileName;

    public ApplicationContext(String fileName) {
        this.fileName = fileName;
    }

    public void init() {
        loadFile();
    }

    private void loadFile() {
        InputStream is = getClass().getClassLoader().getResourceAsStream(fileName);
        List<BeanDefinition> beanDefinitions = YamlUtil.loadYaml(is);
        setBeanDefineMap(beanDefinitions);
        if (beanDefinitions != null && !beanDefinitions.isEmpty()) {
            for (BeanDefinition beanDefinition : beanDefinitions) {
                try {
                    getBean(beanDefinition.getBeanName());
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
