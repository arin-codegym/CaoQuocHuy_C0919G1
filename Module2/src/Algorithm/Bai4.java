package Algorithm;

import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap n cho bieu thuc S=15-1+1/2-1/3!+....+(-1)n  1/n!");
        int n = sc.nextInt();
        double s = 15.0;
        int giaithua = 1;
        for (int i = 1; i <= n; i++) {
            giaithua *= i;
        }
        s += (Math.pow((-1), n)) / giaithua;
        System.out.println(s);

    }
}
