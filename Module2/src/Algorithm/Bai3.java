package Algorithm;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap n cho bieu thuc S=1+1/2+1/3+....+1/n");
        int n = sc.nextInt();
        double res=0.0;
        for (double i=1;i<=n;i++){
            res +=  1/i;
        }
        System.out.println(res);
    }
}
