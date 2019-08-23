/*
 * Copyright (c) 2019.
 * @File: SingleResponsibility1.java
 * @Description:
 * @Author: sunys
 * @Date: 2019/8/18 下午4:27
 * @since:
 */

package com.syshlang.designprinciple.singleresponsibility;

/**
 * @author sunys
 */
public class SingleResponsibility1 {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.run("摩托车");
        vehicle.run("汽车");
        vehicle.run("飞机");
    }
    private static class  Vehicle{
        void run(String vehicle) {
            System.out.println(vehicle + " 在公路上运行....");
        }
    }
}

