package com.gupao.edu.vip.course.chapter4;


import com.gupao.edu.vip.course.chapter4.service.ServiceImpl;

public class Demo05 {


    public static void main(String[] args) {

       synchronized (Demo05.class){
           new ServiceImpl().add(1,2);
       }

    }
}


