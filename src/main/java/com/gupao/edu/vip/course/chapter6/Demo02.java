package com.gupao.edu.vip.course.chapter6;

/**
 * 静态分派
 */
public class Demo02 {

    static class Super {

    }

    static class Sub1 extends Super{}

    static class Sub2 extends Super{}


    public void test(Sub1 sub1){
        System.out.println("sub1 is called");
    }

    public void test(Sub2 sub2){
        System.out.println("sub1 is called");
    }
    public void test(Super parent){
        System.out.println("parent is called");
    }

    public static void main(String[] args) {
        Super c1 = new Sub1();
        Super c2 = new Sub2();
        Demo02 demo02 = new Demo02();
        demo02.test((Sub1)c1);
        demo02.test(c2);
    }
}
