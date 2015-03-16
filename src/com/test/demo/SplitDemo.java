package com.test.demo;

import java.util.Date;

/**
 * Created by Administrator on 2015/3/16 0016.
 */
public class SplitDemo {
    public static void main(String[] args){
        String value = "2007-10-11" ;
        String[] strs = value.split("-") ;
        System.out.println(strs[0]+"年"+strs[1]+"月"+strs[2]+"日") ;
        Date date = new Date() ;
        System.out.println(date) ;
    }
}
