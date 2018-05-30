package com.course.testng;

import org.testng.annotations.*;

public class BasicAnnotation {

    //最基本的注解，用来把方法标记为测试的一部分
    @Test
    public void testCase1(){
        System.out.printf("Thread Id : %s%n",Thread.currentThread().getId());
        System.out.println("Test这是测试用例1");
    }

    @Test
    public void testCase2(){
        System.out.printf("Thread Id : %s%n",Thread.currentThread().getId());
        System.out.println("Test这是测试用例2");
    }
    @BeforeMethod
    public void BeforeMethod(){
        System.out.println("BeforeMethod这是在每个@Test方法前运行的");
    }
    @AfterMethod
    public void AfterMethod(){
        System.out.println("AfterMethod这是在每个@Test方法后运行的");
    }
    @BeforeClass
    public void BeforeClass(){
        System.out.println("BeforeClass这是在每个@BeforeMethod方法前运行的");
    }
    @AfterClass
    public void AfterClass(){
        System.out.println("AfterClass这是在每个@AfterMethod方法后运行的");
    }
    @BeforeSuite
    public void BeforeSuite(){
        System.out.println("BeforeSuite测试套件");
    }
    @AfterSuite
    public void AfterSuite(){
        System.out.println("AfterSuite测试套件");
    }
    @BeforeGroups
    public void BeforeGroups(){
        System.out.println("BeforeGroups测试组");
    }
    @AfterGroups
    public void AfterGroups(){
        System.out.println("AfterGroups测试组");
    }
}
