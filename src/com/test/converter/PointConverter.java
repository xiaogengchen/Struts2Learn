package com.test.converter;

import com.test.bean.Point;
import ognl.DefaultTypeConverter;

import java.util.Map;

/**
 * Created by Administrator on 2015/3/16 0016.
 */
public class PointConverter extends DefaultTypeConverter {
    @Override
    public Object convertValue(Map context, Object value, Class toType) {
        if( toType == Point.class){
            Point point = new Point() ;
            String[] str = (String[])value ;
            String[] paramValues = str[0].split(",") ;
            int x = Integer.parseInt(paramValues[0]) ;
            int y = Integer.parseInt(paramValues[1]) ;
            point.setX(x);
            point.setY(y);
            return point ;
        }
        if( toType == String.class){
            Point point = (Point)value ;
            int x = point.getX() ;
            int y = point.getY() ;
            String result = "[x="+ x + ",y=" + y + "]" ;
            return result ;
        }
        return null ;
    }
}
