package KeThua.CircleCylinder;

import java.util.Scanner;

public class CylinderTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle = new Circle(1.0,"green");
        circle.setColor("red");
        System.out.println(circle);
        Cylinder cylinder;
        cylinder =new Cylinder(circle.getRadius(),circle.getColor(), 2.0);
        System.out.println(cylinder);
        circle.setColor("red");
       System.out.println(cylinder.getColor());
       // System.out.println(cylinder.getRadius());


    }
}
