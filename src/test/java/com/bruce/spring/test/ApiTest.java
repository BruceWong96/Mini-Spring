package com.bruce.spring.test;

import com.bruce.spring.bean.factory.config.BeanDefinition;
import com.bruce.spring.bean.BeanFactory;
import com.bruce.spring.bean.factory.support.DefaultListableBeanFactory;
import com.bruce.spring.test.bean.UserService;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.NoOp;
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
        UserService userService = (UserService) beanFactory.getBean("userService", "Bruce");
        userService.queryUserInfo();
    }

    @Test
    public void test_cglib() {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(UserService.class);
        enhancer.setCallback(new NoOp() {
            @Override
            public int hashCode() {
                return super.hashCode();
            }
        });
        Object obj = enhancer.create(new Class[]{String.class}, new Object[]{"Bruce"});
        System.out.println(obj);
    }
}
