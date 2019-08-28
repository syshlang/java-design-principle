/*
 * Copyright (c) 2019.
 * @File: Openclose1.java
 * @Description:
 * @Author: sunys
 * @Date: 2019/8/28 下午4:35
 * @since:
 */

package com.syshlang.designprinciple.openclose;

/**
 * @author sunys
 */
public class Openclose1 {

    public static void main(String[] args) {
        CalculatePerimeter calculatePerimeter = new CalculatePerimeter();
        Rectangle rectangle = new Rectangle(8,4);
        calculatePerimeter.calculatePerimeter(rectangle);
        //如果需要增加计算圆周长，只需自行扩展圆类型
        Circle circle = new Circle(4);
        calculatePerimeter.calculatePerimeter(circle);
    }
    /**
     * 计算几何图形周长的工具类
     */
    private static class CalculatePerimeter{
        public double calculatePerimeter(Shape shape){
            return shape.shapePerimeter();
        }
    }

    /**
     * 抽象出几何图形基类
     */
    private  static abstract class Shape{
        public abstract double shapePerimeter();
    }

    /**
     * 在矩形中实现计算周长的细节
     */
    private static class Rectangle  extends Shape{
        private double length;
        private double width;

        public Rectangle(double length, double width) {
            this.length = length;
            this.width = width;
        }

        @Override
        public double shapePerimeter() {
            return (length + width) * 2;
        }
    }

    /**
     * 扩展计算圆形周长
     */
    private static class Circle  extends Shape{
        private final double π = 3.14;
        private double radius;

        public Circle(double radius) {
            this.radius = radius;
        }

        @Override
        public double shapePerimeter() {
            return 2 * π *radius;
        }
    }

}
