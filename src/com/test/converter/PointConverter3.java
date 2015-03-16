package com.test.converter;

import com.test.bean.Point;
import org.apache.struts2.util.StrutsTypeConverter;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2015/3/16 0016.
 */
public class PointConverter3 extends StrutsTypeConverter {
    @Override
    public Object convertFromString(Map map, String[] strings, Class aClass) {
        List<Point> pointList = new ArrayList<Point>() ;
        for (int i = 0; i < strings.length; i++) {
            Point point = new Point() ;
            String[] strs = strings[i].split(",") ;
            int x = Integer.parseInt(strs[0]) ;
            int y = Integer.parseInt(strs[1]) ;
            point.setX(x);
            point.setY(y);
            pointList.add(point) ;
        }
        return pointList;
    }

    @Override
    public String convertToString(Map map, Object o) {
        List<Point> pointList = (ArrayList<Point>)o ;
        Iterator<Point> pointIter = pointList.iterator() ;
        String str = "" ;
        while(pointIter.hasNext()){
            Point point = pointIter.next() ;
            int x = point.getX() ;
            int y = point.getY() ;
            str += "(x="+x+",y="+y+")\r\n" ;
        }
        return str;
    }
}
