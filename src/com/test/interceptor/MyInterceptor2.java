package com.test.interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

/**
 * Created by Administrator on 2015/3/19 0019.
 */
public class MyInterceptor2 extends AbstractInterceptor {
    @Override
    public String intercept(ActionInvocation actionInvocation) throws Exception {
        System.out.println("intercept2");
        String result = actionInvocation.invoke() ;
        System.out.println("finish2");
        return result;
    }
}
