package com.test.converter;

import com.test.bean.Point;
import org.apache.struts2.util.StrutsTypeConverter;

import java.util.Map;

/**
 * Created by Administrator on 2015/3/16 0016.
 */
public class PointConverter2 extends StrutsTypeConverter {
    @Override
    public Object convertFromString(Map map, String[] strings, Class aClass) {
        Point point = new Point() ;
        String[] paramValues = strings[0].split(",") ;
        int x = Integer.parseInt(paramValues[0]) ;
        int y = Integer.parseInt(paramValues[1]) ;
        point.setX(x);
        point.setY(y);
        return point;
    }

    @Override
    public String convertToString(Map map, Object o) {
        Point point = (Point)o ;
        int x = point.getX() ;
        int y = point.getY() ;
        String result = "(x="+x+",y="+y+")" ;
        return result;
    }
}
