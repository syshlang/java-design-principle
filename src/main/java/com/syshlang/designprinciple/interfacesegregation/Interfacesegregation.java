/*
 * Copyright (c) 2019.
 * @File: interfacesegregation.java
 * @Description:
 * @Author: sunys
 * @Date: 2019/8/23 上午10:10
 * @since:
 */

package com.syshlang.designprinciple.interfacesegregation;

/**
 * @author sunys
 */
public class Interfacesegregation {
    public static void main(String[] args) {
        B b = new B();
        b.dependA(new A());
    }
    interface InterfaceCommon{
        void methodA();
        void methodOther();
    }


    private static class A implements InterfaceCommon{
        public void methodA() {
            System.out.println("A类方法");
        }

        public void methodOther() {
            System.out.println("其他类方法");
        }
    }

    private static class B {
        public void dependA(InterfaceCommon interfaceCommon){
            System.out.println("通过公共接口依赖A类调用A类方法");
        }
    }
}


