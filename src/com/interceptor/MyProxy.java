package com.interceptor;

import java.lang.reflect.Proxy ;
/**
 * Created by Administrator on 2015/3/19 0019.
 */
public class MyProxy {
    public Object getProxy(Object object){
        MyHandler myHandler = new MyHandler() ;
        myHandler.setObject(object);
        return Proxy.newProxyInstance(Target.class.getClassLoader(),object.getClass().getInterfaces(),myHandler) ;
    }
}
