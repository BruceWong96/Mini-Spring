package com.bruce.spring.bean;

import com.bruce.spring.bean.exception.BeansException;

public interface BeanFactory {

    public Object getBean(String name) throws BeansException;

    /**
     * 有构造函数，需要传入参数
     * @param name
     * @param args
     * @return
     * @throws BeansException
     */
    public Object getBean(String name, Object... args) throws BeansException;
}
