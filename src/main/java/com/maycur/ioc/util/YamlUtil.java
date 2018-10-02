package com.maycur.ioc.util;

import com.maycur.ioc.bean.BeanDefinition;
import org.yaml.snakeyaml.Yaml;
import org.yaml.snakeyaml.constructor.Constructor;

import java.io.InputStream;
import java.util.List;

public class YamlUtil {

    public static List<BeanDefinition> loadYaml(InputStream is) {
        Constructor constructor = new Constructor(List.class);
        Yaml yaml = new Yaml(constructor);
        return (List<BeanDefinition>) yaml.load(is);
    }

}
