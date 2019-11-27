import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("S=1+1/3!+1/5!+…..+1/(2n-1)!");
        int n = sc.nextInt();
        double S = 1.0;
        double factorial = 2 * n - 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        S+=1/factorial;
        System.out.println(S);

    }
}
