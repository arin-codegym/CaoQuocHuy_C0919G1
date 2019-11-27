package Algorithm;

import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        System.out.println("S=1+1/3!+1/5!+…..+1/(2n-1)!");
        System.out.println("nhap n");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double factorial = 1;
        double S = 1.0;
        for (int i = 1; i <= n; i++) {
            factorial *= (2 * i - 1);
            S += 1 / factorial;
        }
        System.out.println(S);
    }
}
