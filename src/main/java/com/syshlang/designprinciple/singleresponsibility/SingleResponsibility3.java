/*
 * Copyright (c) 2019.
 * @File: SingleResponsibility3.java
 * @Description:
 * @Author: sunys
 * @Date: 2019/8/18 下午4:51
 * @since:
 */

package com.syshlang.designprinciple.singleresponsibility;

/**
 * @author sunys
 */
public class SingleResponsibility3 {
    public static void main(String[] args) {
        VehicleCommon vehicleCommon  = new VehicleCommon();
        vehicleCommon.runRoad("汽车");
        vehicleCommon.runAir("飞机");
        vehicleCommon.runWater("轮船");
    }
}

class VehicleCommon {
    public void runRoad(String vehicle) {
        System.out.println(vehicle + " 在公路上运行....");

    }
    public void runAir(String vehicle) {
        System.out.println(vehicle + " 在天空上运行....");
    }
    public void runWater(String vehicle) {
        System.out.println(vehicle + " 在水中行....");
    }
}
