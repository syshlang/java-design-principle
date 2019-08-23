/*
 * Copyright (c) 2019.
 * @File: People.java
 * @Description:
 * @Author: sunys
 * @Date: 2019/8/23 下午3:50
 * @since:
 */

package com.syshlang.designprinciple.dependenceinversion;

/**
 * 构造函数传递依赖对象
 * @author sunys
 */
public class People  implements Communicate{
    private Communicate communicate;
    //构造函数注入
    public People(Communicate communicate) {
        this.communicate = communicate;
    }
    public void sendMessage() {
        communicate.sendMessage();
    }
}
interface  Communicate{
    void sendMessage();
}