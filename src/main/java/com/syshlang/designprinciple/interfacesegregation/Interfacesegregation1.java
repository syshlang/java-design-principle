/*
 * Copyright (c) 2019.
 * @File: Interfacesegregation1.java
 * @Description:
 * @Author: sunys
 * @Date: 2019/8/23 上午10:31
 * @since:
 */

package com.syshlang.designprinciple.interfacesegregation;

/**
 * @author sunys
 */
public class Interfacesegregation1 {
    public static void main(String[] args) {
        D d = new D();
        d.dependC(new C());
    }
}

interface InterfaceC{
    void methodC();
}

interface InterfaceOther{
    void methodOther();
}

class C implements InterfaceC{
    public void methodC() {
        System.out.println("C类方法");
    }
}

class D {
    public void dependC(InterfaceC interfaceC){
        System.out.println("通过最小接口依赖C类调用C类方法");
    }
}
