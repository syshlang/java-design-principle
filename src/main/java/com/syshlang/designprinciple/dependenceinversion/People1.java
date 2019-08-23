/*
 * Copyright (c) 2019.
 * @File: People1.java
 * @Description:
 * @Author: sunys
 * @Date: 2019/8/23 下午3:55
 * @since:
 */

package com.syshlang.designprinciple.dependenceinversion;

/**
 * Setter方法传递依赖对象
 * @author sunys
 */
public class People1 implements Communicate1{
    private Communicate communicate;
    //Setter依赖注入

    public void setCommunicate(Communicate communicate) {
        this.communicate = communicate;
    }

    public void sendMessage() {
        communicate.sendMessage();
    }
}
interface  Communicate1{
    void sendMessage();
}
