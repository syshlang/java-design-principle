/*
 * Copyright (c) 2019.
 * @File: Dependenceinversion1.java
 * @Description:
 * @Author: sunys
 * @Date: 2019/8/23 下午3:08
 * @since:
 */

package com.syshlang.designprinciple.dependenceinversion;

/**
 * @author sunys
 */
public class Dependenceinversion1 {
    public static void main(String[] args) {
        People people = new People();
        people.sendMessage(new SMScommunicate());
        people.sendMessage(new QQcommunicate());
        people.sendMessage(new Wechatcommunicate());
    }

    private interface  Communicate{
        void sendMessage();
    }

    private static class SMScommunicate implements Communicate{
        public void sendMessage(){
            System.out.println("使用手机短信发送信息！");
        }
    }

    private static class QQcommunicate implements Communicate{

        public void sendMessage() {
            System.out.println("使用QQ发送信息！");
        }
    }
    private static class Wechatcommunicate implements Communicate{

        public void sendMessage() {
            System.out.println("使用微信发送信息！");
        }
    }

    private static class People{
       public void sendMessage(Communicate communicate){
           communicate.sendMessage();
       }
    }
}


