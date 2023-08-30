package com.bruce.spring.bean.factory.support;

import com.bruce.spring.bean.factory.config.BeanDefinition;

/**
 * 注册 bean 接口
 */
public interface BeanDefinitionRegistry {
    /**
     * 向注册表中注册BeanDefinition
     */
    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);
}
