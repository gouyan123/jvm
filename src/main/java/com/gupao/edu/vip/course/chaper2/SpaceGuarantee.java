package com.gupao.edu.vip.course.chaper2;

public class SpaceGuarantee {

    public static void main(String[] args) {
        //d1需要 2M内存空间
        byte[] d1 = new byte[2 * 1024 * 1024];
        byte[] d2 = new byte[2 * 1024 * 1024];
        byte[] d3 = new byte[2 * 1024 * 1024];
        byte[] d4 = new byte[4 * 1024 * 1024];

        System.gc();

    }
}
