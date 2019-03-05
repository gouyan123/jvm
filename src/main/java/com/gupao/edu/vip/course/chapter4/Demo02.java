package com.gupao.edu.vip.course.chapter4;

public class Demo02 {
    public static void main(String[] args) {
      //0: new #2 分配内存空间；invokespecial #3 // Method com/gupao/edu/vip/course/chapter4/User."<init>":()V 实例化对象
      User user = new User();
      user.name = "h1";
      String name = user.name;
      User[] users = new User[10];
      int[] ints = new int[10];
    }
}


