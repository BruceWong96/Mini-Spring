package com.bruce.spring.bean;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * 创建出一个用于传递类中属性信息的类，因为属性可能会有很多，需要定义一个集合包装下
 *
 * @author Bruce Wong
 * @date 2023年08月31日 23:36
 */
public class PropertyValues {
    private final List<PropertyValue> propertyValueList = new ArrayList<>();

    public void addPropertyValue(PropertyValue pv){
        this.propertyValueList.add(pv);
    }
    public PropertyValue[] getPropertyValueList() {
        return this.propertyValueList.toArray(new PropertyValue[0]);
    }

    public PropertyValue getPropertyValue(String propertyName){
        for (PropertyValue pv : propertyValueList) {
            if (pv.getName().equals(propertyName)){
                return pv;
            }
        }
        return null;
    }
}
