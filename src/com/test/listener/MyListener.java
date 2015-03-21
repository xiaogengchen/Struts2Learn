package com.test.listener;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.PreResultListener;

/**
 * Created by Administrator on 2015/3/20 0020.
 */
public class MyListener implements PreResultListener{
    @Override
    public void beforeResult(ActionInvocation actionInvocation, String s) {
        System.out.println("result :" + s) ;
    }
}
