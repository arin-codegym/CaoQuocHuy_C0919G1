package Algorithm;

import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\tTính n!!\t=\t1*3*5*…..*n(n lẽ)\n" +
                "\t\t\t=\t2*4*6*….*n(n chẵn)\n:"+"\nn :");
        int n = sc.nextInt();
    int S=1;
    if (n%2==0){
        for (int i=2;i<=n;i+=2){
            S*=i;
        }
        System.out.println("giai thua so chan n");
        System.out.println(S);
    } else if (n!=0){
        for (int i =1;i<=n;i+=2){
            S*=i;
        }
        System.out.println("giai thua so le  n");
        System.out.println(S);
    }
    }
}
