package com.bruce.spring.test;

import com.bruce.spring.bean.factory.config.BeanDefinition;
import com.bruce.spring.bean.BeanFactory;
import com.bruce.spring.bean.factory.support.DefaultListableBeanFactory;
import com.bruce.spring.test.bean.UserService;
import org.junit.Test;

public class ApiTest {

    @Test
    public void test_BeanFactory() {
        // 1.  init BeanFactory
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        // 2. 注册 bean
        BeanDefinition beanDefinition = new BeanDefinition(UserService.class);
        beanFactory.registerBeanDefinition("userService", beanDefinition);
        // 3. 第一次 get bean
        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.queryUserInfo();
        // 4. 第二次 get bean , bean from Singleton
        UserService userServiceSingleton = (UserService) beanFactory.getBean("userService");
        userServiceSingleton.queryUserInfo();


    }
}
