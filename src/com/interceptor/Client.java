package com.interceptor;

/**
 * Created by Administrator on 2015/3/19 0019.
 */
public class Client {
    public static void main(String[] args){
        TargetInterface target = new Target() ;
        MyProxy myProxy = new MyProxy() ;
        TargetInterface proxy = (TargetInterface)myProxy.getProxy(target) ;
        proxy.doSomething();
    }
}
