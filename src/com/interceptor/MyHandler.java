package com.interceptor;

import com.opensymphony.xwork2.interceptor.*;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by Administrator on 2015/3/19 0019.
 */
public class MyHandler implements InvocationHandler {
    private Object object ;
    private Interceptor interceptor = new Interceptor() ;
    public void setObject(Object object){
        this.object = object ;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = null ;
        interceptor.before();
        result = method.invoke(object,args) ;
        interceptor.after() ;
        return result;
    }
}
