package com.bruce.spring.test;

import com.bruce.spring.bean.PropertyValue;
import com.bruce.spring.bean.PropertyValues;
import com.bruce.spring.bean.factory.config.BeanDefinition;
import com.bruce.spring.bean.BeanFactory;
import com.bruce.spring.bean.factory.config.BeanReference;
import com.bruce.spring.bean.factory.support.DefaultListableBeanFactory;
import com.bruce.spring.test.bean.UserDao;
import com.bruce.spring.test.bean.UserService;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.NoOp;
import org.junit.Test;

public class ApiTest {

    @Test
    public void test_BeanFactory() {
        // 1. 初始化 BeanFactory
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();

        // 2. UserDao 注册
        beanFactory.registerBeanDefinition("userDao", new BeanDefinition(UserDao.class));

        // 3. UserService 设置属性
        PropertyValues propertyValues = new PropertyValues();
        propertyValues.addPropertyValue(new PropertyValue("uId", "10002"));
        propertyValues.addPropertyValue(new PropertyValue("userDao", new BeanReference("userDao")));

        // 4. UserService 注入 bean
        BeanDefinition beanDefinition = new BeanDefinition(UserService.class, propertyValues);
        beanFactory.registerBeanDefinition("userService", beanDefinition);

        // 5. UserService 获取 bean
        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.queryUserInfo();
    }
}
