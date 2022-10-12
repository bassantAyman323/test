package org.kushick.javabrains;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import java.util.List;

public class Triangle implements ApplicationContextAware, BeanNameAware {
    //    private String type;
//    private int height;
//
//    public int getHeight() {
//        return height;
//    }
//    public Triangle(String type){
//        this.type=type;
//    }
//    public Triangle(int height){
//        this.height=height;
//    }
//    public Triangle(String type,int height){
//        this.type=type;
//        this.height=height;
//
//    }
//
//    public String getType() {
//        return type;
//    }
//
////    public void setType(String type) {
////        this.type = type;
////    }
//
//    public void draw(){
//        System.out.println(getType()+" Triangle draw of height "+getHeight());
//    }
    private Point pointA;
    private Point pointB;
    private Point pointC;
    private ApplicationContext context=null;

//    private List<Point> pointList;
//
//    public List<Point> getPointList() {
//        return pointList;
//    }
//
//    public void setPointList(List<Point> pointList) {
//        this.pointList = pointList;
//    }
    public Point getPointA() {
        return pointA;
    }

    public void setPointA(Point pointA) {
        this.pointA = pointA;
    }

    public Point getPointB() {
        return pointB;
    }

    public void setPointB(Point pointB) {
        this.pointB = pointB;
    }

    public Point getPointC() {
        return pointC;
    }

    public void setPointC(Point pointC) {
        this.pointC = pointC;
    }

    public void draw() {
        System.out.println("PointA= " + getPointA().getX() + " , " +getPointA().getY());
        System.out.println("PointB= " + getPointB().getX() + " , " +getPointB().getY());
        System.out.println("PointC= " + getPointC().getX() + " , " +getPointC().getY());

//        for(Point point:pointList){
//            System.out.println("Point= " + point.getX() + " , " +point.getY());
//        }
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.context=context;
    }

    @Override
    public void setBeanName(String beanName) {
        System.out.println("Bean Name is "+beanName);
    }
}
