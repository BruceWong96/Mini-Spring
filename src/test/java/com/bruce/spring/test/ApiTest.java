package com.bruce.spring.test;

import com.bruce.spring.bean.BeanDefinition;
import com.bruce.spring.bean.BeanFactory;
import com.bruce.spring.test.bean.UserService;
import org.junit.Test;

public class ApiTest {

    @Test
    public void test_BeanFactory() {
        // 1. init BeanFactory
        BeanFactory beanFactory = new BeanFactory();

        // 2. 注册 bean
        BeanDefinition beanDefinition = new BeanDefinition(new UserService());
        beanFactory.registerBeanDefinition("userService", beanDefinition);

        // 3. 获取 bean
        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.queryUserInfo();
    }
}