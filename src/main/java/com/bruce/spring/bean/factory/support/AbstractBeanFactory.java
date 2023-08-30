package com.bruce.spring.bean.factory.support;

import com.bruce.spring.bean.BeanFactory;
import com.bruce.spring.bean.exception.BeansException;
import com.bruce.spring.bean.factory.config.BeanDefinition;

/**
 * 获取 bean 的抽象类
 */
public abstract class AbstractBeanFactory extends DefaultSingletonBeanRegistry implements BeanFactory {

    @Override
    public Object getBean(String name) throws BeansException {
        Object bean = getSingleton(name);
        if (bean != null) {
            return bean;
        }

        BeanDefinition beanDefinition = getBeanDefinition(name);
        return createBean(name, beanDefinition);
    }

    protected abstract BeanDefinition getBeanDefinition(String beanName) throws BeansException;

    protected abstract Object createBean(String beanName, BeanDefinition beanDefinition) throws BeansException;
}
