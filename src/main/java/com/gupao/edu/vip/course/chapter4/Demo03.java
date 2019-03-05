package com.gupao.edu.vip.course.chapter4;


import com.gupao.edu.vip.course.chapter4.api.Service;
import com.gupao.edu.vip.course.chapter4.service.ServiceImpl;

public class Demo03 {


    public static void main(String[] args) {

        Service service = new ServiceImpl();
        int result = service.add(1,2);
    }
}


