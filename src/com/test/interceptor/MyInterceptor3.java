package com.test.interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;
import com.test.listener.MyListener;

/**
 * Created by Administrator on 2015/3/19 0019.
 */
public class MyInterceptor3 extends MethodFilterInterceptor {
    @Override
    protected String doIntercept(ActionInvocation actionInvocation) throws Exception {
        actionInvocation.addPreResultListener(new MyListener());
        System.out.println("my interceptor3");
        String result = actionInvocation.invoke() ;
        System.out.println("after my interceptor3 finished") ;
        return result;
    }
}
