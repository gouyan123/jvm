package com.gupao.edu.vip.course.chapter2;

public class BigObjectIntoOldGen {
    public static void main(String[] args) {
        byte[] d1 = new byte[6 * 1024 * 1024];
    }
}
