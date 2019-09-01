/*
 * Copyright (c) 2019.
 * @File: Demeterprinciple.java
 * @Description:
 * @Author: sunys
 * @Date: 2019/9/1 下午10:27
 * @since:
 */

package com.syshlang.designprinciple.demeterprinciple;

import java.util.ArrayList;
import java.util.List;

/**
 * @author sunys
 */
public class Demeterprinciple {
    public static void main(String[] args) {
        DevelopmentCenterManage.showPerformance();
    }

    /**
     * 开发中心员工
     */
    private static class DevelopmentCenter{
        private String name;
        private String performance;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPerformance() {
            return performance;
        }

        public void setPerformance(String performance) {
            this.performance = performance;
        }
    }
    /**
     * 开发中心的开发一部员工
     */
    private static class FirstDepartment{
        private String name;
        private String performance;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPerformance() {
            return performance;
        }

        public void setPerformance(String performance) {
            this.performance = performance;
        }
    }

    /**
     *  开发中心的开发一部员工管理类
     */
    private static class FirstDepartmentManager{
        private static List<FirstDepartment> getFirstDepartment(){
            List<FirstDepartment> firstDepartmentList = new ArrayList<FirstDepartment>();
            FirstDepartment firstDepartment = new FirstDepartment();
            firstDepartment.setName("zhangsan");
            firstDepartment.setPerformance("A");
            firstDepartmentList.add(firstDepartment);
            return firstDepartmentList;
        }
    }
    /**
     * 开发中心管理类
     */
    private static class DevelopmentCenterManage{
        /**
         * 获取开发中心所有员工绩效
         * @return
         */
        private static List<DevelopmentCenter>  getDevelopmentCenter(){
           List<DevelopmentCenter> developmentCenterList = new ArrayList<DevelopmentCenter>();
           DevelopmentCenter developmentCenter  = new DevelopmentCenter();
           developmentCenter.setName("zhangsan");
           developmentCenter.setPerformance("A");
           developmentCenterList.add(developmentCenter);
           return developmentCenterList;
        }

        /**
         * 打印绩效
         */
        private static void showPerformance(){
            List<DevelopmentCenter> developmentCenterList = getDevelopmentCenter();
            for (DevelopmentCenter developmentCenter : developmentCenterList ){
                System.out.println("name："+ developmentCenter.getName() + " performance:"+ developmentCenter.getPerformance());
            }
            // 开发中心的开发一部员工普遍绩效比较优秀也要打印出来
            // 但此处引入了DevelopmentCenterManage的非直接朋友类FirstDepartment，违反了迪米特法则
            List<FirstDepartment> firstDepartmentList = FirstDepartmentManager.getFirstDepartment();
            for (FirstDepartment firstDepartment : firstDepartmentList) {
                System.out.println("name："+ firstDepartment.getName() + " performance:"+ firstDepartment.getPerformance());
            }
        }
    }
}
