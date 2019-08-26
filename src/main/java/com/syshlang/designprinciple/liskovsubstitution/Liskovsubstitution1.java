/*
 * Copyright (c) 2019.
 * @File: Liskovsubstitution1.java
 * @Description:
 * @Author: sunys
 * @Date: 2019/8/26 下午10:18
 * @since:
 */

package com.syshlang.designprinciple.liskovsubstitution;

/**
 * @author sunys
 */
public class Liskovsubstitution1 {
    public static void main(String[] args) {
        TransportationSpeed transportationSpeed = new TransportationSpeed("轮船",120);
        transportationSpeed.runSpeed();
    }
    private static class Transportation{
        public String way;
        public int speed;
    }
    private static class TransportationWay extends Transportation{
        void run(String transportation) {
            System.out.println(transportation + " 在水中航行....");
        }
    }
    private static class TransportationSpeed extends Transportation{
        //如果需要使用TransportationWay类的方法,使用组合关系
        private TransportationWay transportationWay = new TransportationWay();
        public TransportationSpeed(String way,int speed) {
            this.way = way;
            this.speed = speed;
        }

        public TransportationSpeed() {

        }

        void runSpeed(){
            //组合调用TransportationWay类run方法获取行驶方式
            transportationWay.run(way);
            System.out.println("行驶速度为："+ speed);
        }
    }
}
