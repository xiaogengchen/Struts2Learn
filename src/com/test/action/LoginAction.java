package com.test.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import java.util.Map;

/**
 * Created by Administrator on 2015/3/15 0015.
 */
public class LoginAction extends ActionSupport {
    private String username ;
    private String password ;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    @SuppressWarnings("unchecked")
    public String execute() throws Exception {
        if("hello".equals(this.getUsername()) && "world".equals(this.getPassword())){
            Map map = ActionContext.getContext().getSession();
            map.put("user","valid") ;
            return SUCCESS;
        }else{
            this.addFieldError("username","username or password error");
            return INPUT ;
        }
    }

    @Override
    public void validate() {
        if(null == this.getUsername() || "".equals(this.getUsername().trim())){
            this.addFieldError("username","username required");
        }
        if(null == this.getPassword() || "".equals(this.getPassword().trim())){
            this.addFieldError("password","password required");
        }
    }
}
