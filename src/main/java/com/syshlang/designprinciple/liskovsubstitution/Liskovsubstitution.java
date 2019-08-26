/*
 * Copyright (c) 2019.
 * @File: Liskovsubstitution.java
 * @Description:
 * @Author: sunys
 * @Date: 2019/8/26 下午9:42
 * @since:
 */

package com.syshlang.designprinciple.liskovsubstitution;

/**
 * @author sunys
 */
public class Liskovsubstitution {
    public static void main(String[] args) {
        Transportation transportation = new Transportation();
        transportation.run("轮船");
        Transportation1 transportation1 = new Transportation1();
        transportation1.run("轮船");
        transportation1.runSpeed(120);
    }
    private static class  Transportation{
        void run(String transportation) {
            System.out.println(transportation + " 在水中航行....");
        }
    }
    private static class Transportation1 extends Transportation{
        /**
         * 覆盖父类的方法
         * @param vehicle
         */
        @Override
        void run(String vehicle) {
            System.out.println(vehicle + " 在公路上运行....");
        }
        void runSpeed(int runSpeed){
            System.out.println("行驶速度为："+ runSpeed);
        }
    }
}
