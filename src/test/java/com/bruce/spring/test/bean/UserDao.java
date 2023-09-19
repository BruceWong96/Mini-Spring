package com.bruce.spring.test.bean;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Bruce Wong
 * @date 2023年09月19日 22:24
 */
public class UserDao {
    private static Map<String, String> hashMap = new HashMap<>();

    static {
        hashMap.put("10001", "张三");
        hashMap.put("10002", "李四");
        hashMap.put("10003", "王五");
    }

    public String queryUserName(String uid) {
        return hashMap.get(uid);
    }
}
