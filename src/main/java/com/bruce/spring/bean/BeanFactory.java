package com.bruce.spring.bean;

import com.bruce.spring.bean.exception.BeansException;
import com.bruce.spring.bean.factory.config.BeanDefinition;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public interface BeanFactory {
    public Object getBean(String name) throws BeansException;

}
