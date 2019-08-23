/*
 * Copyright (c) 2019.
 * @File: Dependenceinversion.java
 * @Description:
 * @Author: sunys
 * @Date: 2019/8/23 下午2:43
 * @since:
 */

package com.syshlang.designprinciple.dependenceinversion;

/**
 * @author sunys
 */
public class Dependenceinversion {
    public static void main(String[] args) {
        People people = new People();
        people.sendMessageBySMS(new SMScommunicate());
    }

    static class SMScommunicate{
        public void sendMessage(){
            System.out.println("使用手机短信发送信息！");
        }
    }

    static class People{
        public void sendMessageBySMS(SMScommunicate smScommunicate){
            smScommunicate.sendMessage();
        }
    }
}

