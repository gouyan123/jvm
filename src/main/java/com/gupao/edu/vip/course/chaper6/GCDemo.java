package com.gupao.edu.vip.course.chaper6;

public class GCDemo {


    public static void main(String[] args) {

        {
            byte[] buf = new byte[1024 * 1024 * 30];
        }

        int a = 0;
        System.gc();
    }
}
