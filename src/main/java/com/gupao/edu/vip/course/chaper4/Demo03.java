package com.gupao.edu.vip.course.chaper4;


import com.gupao.edu.vip.course.chaper4.api.Service;
import com.gupao.edu.vip.course.chaper4.service.ServiceImpl;

public class Demo03 {


    public static void main(String[] args) {

        Service service = new ServiceImpl();
        int result = service.add(1,2);
    }
}


