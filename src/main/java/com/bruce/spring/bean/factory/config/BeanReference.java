package com.bruce.spring.bean.factory.config;

/**
 *
 * bean 引用
 * @author Bruce Wong
 * @date 2023年08月31日 23:51
 */
public class BeanReference {
    private final String beanName;

    public BeanReference(String beanName){
        this.beanName = beanName;
    }

    public String getBeanName(){
        return this.beanName;
    }
}
