package NgonNguLapTrinhJava;
import java.math.BigInteger;
import java.util.Scanner;

public class HienThiCacLoaiHinh {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Print the rectangle");
        System.out.println("2. Print the square triangle");
        System.out.println("3. Print isosceles triangle");
        System.out.println("4. Exit");
        System.out.println("enter number function you want use:");
        int input = scanner.nextInt();
        switch (input){
            case 1:
                for (int i = 0; i <3 ; i++) {
                    for (int j = 0; j <=6 ; j++) {
                       System.out.print("*");
                    }
                    System.out.println();
                }
                break;
            case 2:
                for(int i=1; i<=5; i++) {
                    for(int j=1; j<i; j++){
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
            case 3 :
                for (int i = 7; i >=1 ; i--) {
                    for (int j = 1; j <=i ; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
            case 4:break;
            default:
                System.out.println("fail");
        }
    }
}
/*
* import java.math.BigInteger;
import java.util.Scanner;

public class HienThiCacLoaiHinh {
    public static void rectangle(int a, int b) {
        for (int i = 0; i < a; i++) {
            StringBuilder rectangle = new StringBuilder();
            for (int j = 0; j < b; j++) {
                rectangle.append(" * ");
            }
            System.out.println(rectangle);
        }
    }

    private static void square_triangle(int a) {
        for (int i = a; i >= 0; i--) {
            String squareTriangle = "";
            for (int j = 1; j <= i; j++) {
                squareTriangle += " * ";
            }
            System.out.println(squareTriangle);
        }
    }

    private static void isosceles_triangle(int a) {
        for (int i = 1; i <= a; i++) {
            StringBuilder isoscelesTriangle = new StringBuilder();
            for (int j = 1; j <= (a - i); j++) {
                isoscelesTriangle.append(" ");
            }
            for (int k = 1; k <= i; k++) {
                isoscelesTriangle.append("* ");
            }
            System.out.println(isoscelesTriangle);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice = 0;
        System.out.println("1. Print the rectangle");
        System.out.println("2. Print the square triangle ");
        System.out.println("3. Print isosceles triangle");
        System.out.println("4. Exit");
        while (true) {
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("please enter width of rectangle");
                    int widthRectangle = input.nextInt();
                    System.out.println("please enter height ò rectangle");
                    int heightRectangle = input.nextInt();
                    rectangle(heightRectangle, widthRectangle);
                    break;
                case 2:
                    System.out.println("please enter height of square triangle");
                    int heightSquareTriangle = input.nextInt();
                    square_triangle(heightSquareTriangle);
                    break;
                case 3:
                    System.out.println("please enter height of isosceles triangle");
                    int heightIsoscelesTriangle = input.nextInt();
                    isosceles_triangle(heightIsoscelesTriangle);
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("fail!!!");
                    break;
            }
        }
    }
}

* */