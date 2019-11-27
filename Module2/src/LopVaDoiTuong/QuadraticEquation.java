package MangVaPhuongThucJava;

import java.util.Scanner;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;
    public QuadraticEquation() {};
    private QuadraticEquation(double a, double b, double c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    private double getA() {return a;}
    private double getB(){return b;}
    public double getC(){return c;}
    private double getDiscriminant(){
        return (this.b*2-this.a*this.c*4);
    }
    private double getRoot1(){
        return (-this.b+Math.sqrt(Math.pow(this.b,2)-4*this.a*this.c))/2;
    }
    private double getRoot2(){
        return (-this.b-Math.sqrt(Math.pow(this.b,2)-4*this.a*this.c))/2;
    }
    public static void main(String[] args) {
        System.out.println("quadratic equation ax2 + bx + x = 0");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a:");
        double a = sc.nextDouble();
        System.out.println("Enter b:");
        double b = sc.nextDouble();
        System.out.println("Enter c:");
        double c = sc.nextDouble();
        QuadraticEquation quadraticEquation=new QuadraticEquation(a,b,c);
        if (quadraticEquation.getDiscriminant()>0){
            System.out.println("The equation has two roots :"+quadraticEquation.getRoot1()+" and "+quadraticEquation.getRoot2());
        }else if (quadraticEquation.getDiscriminant()==0){
            System.out.println("The equation has one root :"+ -quadraticEquation.getB()/2/quadraticEquation.getA());
        }else {
            System.out.println("The equation has no real roots");
        }
    }
}
