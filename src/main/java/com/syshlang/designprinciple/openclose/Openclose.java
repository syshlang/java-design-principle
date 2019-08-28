/*
 * Copyright (c) 2019.
 * @File: Openclose.java
 * @Description:
 * @Author: sunys
 * @Date: 2019/8/28 上午11:36
 * @since:
 */

package com.syshlang.designprinciple.openclose;

/**
 * @author sunys
 */
public class Openclose {
    public static void main(String[] args) {
        CalculatePerimeter calculatePerimeter = new CalculatePerimeter();
        calculatePerimeter.rectanglePerimeter(8,4);
    }

    /**
     * 计算几何图形周长的工具类，提供了一个计算矩形周长的方法
     * 这个种方式扩展性不好，如果新增一个计算圆形的周长，需要改动类，增加新的方法（违背开闭原则）
     */
    private static class CalculatePerimeter{
        /**
         * 计算矩形周长
         * @param length
         * @param width
         * @return
         */
        public double rectanglePerimeter(double length,double width){
            return (length + width) * 2;
        }
    }
}
