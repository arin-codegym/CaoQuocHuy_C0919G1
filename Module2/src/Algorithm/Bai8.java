package Algorithm;

import java.util.Scanner;

public class Bai8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a:");
        int a = sc.nextInt();
        System.out.println("Enter b:");
        int b = sc.nextInt();
        System.out.println("UCLN :"+UCLN(a,b)+"BCNN :"+a*b/UCLN(a,b));
    }
    public static int UCLN(int a, int b) {
        if (a != b) {
            if (a > b) {
                a -= b;
            } else {
                a = b - a;
            }
        }
        return a;
    }
}
