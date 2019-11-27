package LopVaDoiTuong;

import java.util.Scanner;

public class Rectangle {
    double width,height;
    public Rectangle(){ };
    public Rectangle(double width,double height){
        this.width = width;
        this.height = height;
    }
    public double getArea(){
        return this.width*this.height;
    }

    public double getPerimeter() {
        return (this.height+this.width)*2;
    }
    public String display(){
        return  "Rectangle{" + "width=" + width + ", height=" + height + "}";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter height:");
        double height = sc.nextDouble();
        System.out.println("Enter width :");
        double width = sc.nextDouble();
        Rectangle rectangle = new Rectangle(width,height);
        System.out.println("Perimeter of the Rectangle: "+rectangle.getPerimeter());
        System.out.println("Area of the Rectangle:"+rectangle.getArea());
        System.out.println("Print rectangle");
        System.out.println(rectangle.display());

    }
}
