/*
 * Copyright (c) 2019.
 * @File: SingleResponsibility2.java
 * @Description:
 * @Author: sunys
 * @Date: 2019/8/18 下午4:38
 * @since:
 */

package com.syshlang.designprinciple.singleresponsibility;

/**
 * @author sunys
 */
public class SingleResponsibility2 {
    public static void main(String[] args) {
        RoadVehicle roadVehicle = new RoadVehicle();
        roadVehicle.run("摩托车");
        roadVehicle.run("汽车");

        AirVehicle airVehicle = new AirVehicle();
        airVehicle.run("飞机");

        WaterVehicle waterVehicle = new WaterVehicle();
        waterVehicle.run("轮船");
    }
}

class RoadVehicle {
    void run(String vehicle) {
        System.out.println(vehicle + "公路运行");
    }
}

class AirVehicle {
    void run(String vehicle) {
        System.out.println(vehicle + "天空运行");
    }
}

class WaterVehicle {
    void run(String vehicle) {
        System.out.println(vehicle + "水中运行");
    }
}