package com.test.action;

import com.opensymphony.xwork2.ActionSupport;
import com.test.bean.Point;

import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2015/3/16 0016.
 */
public class PointAction extends ActionSupport {
//    private Point point ;
//    private Point point2 ;
//    private Point point3 ;
    private List<Point> point ;
    private int age ;
    private String username ;
    private Date date ;

    public List<Point> getPoint() {
        return point;
    }

    public void setPoint(List<Point> point) {
        this.point = point;
    }
    //
//    public Point getPoint() {
//        return point;
//    }
//
//    public void setPoint(Point point) {
//        this.point = point;
//    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

//    public Point getPoint2() {
//        return point2;
//    }
//
//    public void setPoint2(Point point2) {
//        this.point2 = point2;
//    }
//
//    public Point getPoint3() {
//        return point3;
//    }
//
//    public void setPoint3(Point point3) {
//        this.point3 = point3;
//    }

    @Override
    public String execute() throws Exception {
        return SUCCESS ;
    }
}
