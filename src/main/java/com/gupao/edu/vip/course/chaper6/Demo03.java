package com.gupao.edu.vip.course.chaper6;

/**
 * 动态分派
 */
public class Demo03 {

    static class Super {
        public void test() {
            System.out.println("parent");
        }
    }

    static class Sub1 extends Super {

        @Override
        public void test() {
            System.out.println("Sub1");
        }
    }

    static class Sub2 extends Super {


        @Override
        public void test() {
            System.out.println("Sub2");
        }
    }

    public static void main(String[] args) {
        Super c1 = new Sub1();
        Super c2 = new Sub2();
        c1.test();
        c2.test();
    }

}
