package com.gupao.edu.vip.course;

public class StackDemo {
    public static int add(int x,int y){
        return x + y;
    }
    public static int mul(int x,int y){
        return x * y;
    }
    /**栈中产生一个 main栈帧，add()方法先入 main栈帧，add()执行完出main栈帧后，mul()方法再入main栈帧*/
    public static void main(String[] args) {
        add(1,2);
        mul(3,4);
    }
}
