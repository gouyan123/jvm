package com.gupao.edu.vip.course.chapter6;

public class GCDemo {
    public static void main(String[] args) {
        {
            byte[] buf = new byte[1024 * 1024 * 30];
        }
        int a = 0;
        /**
         * 会回收 buf，并在buf所在 槽位slot，存储a，因为 buf在 {}里面，跟 System.gc()不在同一个作用域
         * 如果去掉 {}，buf和a在同一个作用域，System.gc()不会回收buf
         * */
        System.gc();
    }
}
