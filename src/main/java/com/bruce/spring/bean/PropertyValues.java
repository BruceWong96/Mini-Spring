package com.bruce.spring.bean;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * 包含了一个类中所有的属性和值，用 List 存储
 *
 * @author Bruce Wong
 * @date 2023年08月31日 23:36
 */
public class PropertyValues {
    private final List<PropertyValue> propertyValueList = new ArrayList<>();

    public void addPropertyValue(PropertyValue pv){
        this.propertyValueList.add(pv);
    }
    public PropertyValue[] getPropertyValues() {
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
