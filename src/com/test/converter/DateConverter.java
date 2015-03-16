package com.test.converter;

import ognl.DefaultTypeConverter;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

/**
 * Created by Administrator on 2015/3/16 0016.
 */
public class DateConverter extends DefaultTypeConverter {
    @Override
    public Object convertValue(Map context, Object value, Class toType) {
        if( toType == Date.class){
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日") ;
            try{
                String[] strValue = (String[])value;
                String[] strs = strValue[0].split("-") ;
                String str = strs[0] + "年" + strs[1] + "月" + strs[2] + "日" ;
                return sdf.parse(str) ;
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        if( toType == String.class){
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日") ;
            return sdf.format((Date)value) ;
        }
        return null ;
    }
}
