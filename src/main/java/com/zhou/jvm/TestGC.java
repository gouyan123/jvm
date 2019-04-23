package com.zhou.jvm;

public class TestGC {
    public static void main(String[] args) {
        new TestGC();
        System.gc();//会触发 Full GC
        System.runFinalization();
    }
}