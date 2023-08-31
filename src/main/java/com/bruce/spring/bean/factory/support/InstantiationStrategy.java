package com.bruce.spring.bean.factory.support;

import com.bruce.spring.bean.exception.BeansException;
import com.bruce.spring.bean.factory.config.BeanDefinition;

import java.lang.reflect.Constructor;

/**
 * Bean 实例化策略接口
 */
public interface InstantiationStrategy {
    /**
     * 实例化 Bean
     *
     * @param beanDefinition
     * @param beanName
     * @param ctor
     * @param args
     * @return
     * @throws BeansException
     */
    Object instantiate(BeanDefinition beanDefinition, String beanName, Constructor ctor, Object[] args) throws BeansException;
}
