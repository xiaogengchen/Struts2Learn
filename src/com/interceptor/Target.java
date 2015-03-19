package com.interceptor;

/**
 * Created by Administrator on 2015/3/19 0019.
 */
public class Target implements TargetInterface {
    @Override
    public void doSomething() {
       System.out.println("do something") ;
    }
}
