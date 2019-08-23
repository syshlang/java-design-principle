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
        B b = new B();
        b.dependC(new A());
    }
    private interface InterfaceA{
        void methodA();
    }

    private interface InterfaceOther{
        void methodOther();
    }

    private static class A implements InterfaceA{
        public void methodA() {
            System.out.println("A类方法");
        }
    }

    private static class B {
        public void dependC(InterfaceA interfaceA){
            System.out.println("通过最小接口依赖A类调用A类方法");
        }
    }
}


