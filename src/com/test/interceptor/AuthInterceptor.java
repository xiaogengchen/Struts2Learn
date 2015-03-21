package com.test.interceptor;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

import java.util.Map;

/**
 * Created by Administrator on 2015/3/21 0021.
 */
public class AuthInterceptor extends AbstractInterceptor {
    @Override
    @SuppressWarnings("unchecked")
    public String intercept(ActionInvocation actionInvocation) throws Exception {
        Map map = actionInvocation.getInvocationContext().getSession() ;
        if(map.get("user")==null){
            return Action.LOGIN ;
        }else{
            return actionInvocation.invoke() ;
        }
    }
}
