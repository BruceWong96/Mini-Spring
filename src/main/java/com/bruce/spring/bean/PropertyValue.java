package com.bruce.spring.bean;

/**
 * bean 属性信息
 *
 * @author Bruce Wong
 * @date 2023年08月31日 23:32
 */
public class PropertyValue {
    private final String name;

    private final Object value;

    public PropertyValue(String name, Object value){
        this.name = name;
        this.value = value;
    }

    public String getName(){
        return this.name;
    }

    public Object getValue(){
        return this.value;
    }


}
