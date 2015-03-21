package com.test.interceptor;


import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

/**
 * Created by Administrator on 2015/3/19 0019.
 */
public class MyInterceptor implements Interceptor{
    private String hello ;

    public String getHello() {
        return hello;
    }

    public void setHello(String hello) {
        this.hello = hello;
    }

    @Override
    public void destroy() {
        System.out.println("destroy ") ;
    }

    @Override
    public void init() {
        System.out.println("init " + hello) ;
    }

    @Override
    public String intercept(ActionInvocation actionInvocation) throws Exception {
        System.out.println("intercept ") ;
        String result = actionInvocation.invoke() ;
        System.out.println("result :" + result) ;
        System.out.println("finish") ;
        return result;
    }
}
