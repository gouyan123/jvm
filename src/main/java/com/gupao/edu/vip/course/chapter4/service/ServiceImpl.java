package com.gupao.edu.vip.course.chapter4.service;


import com.gupao.edu.vip.course.chapter4.api.Service;

public class ServiceImpl implements Service {

    @Override
    public int add(int a, int b) {
        return a + b;
    }
}
