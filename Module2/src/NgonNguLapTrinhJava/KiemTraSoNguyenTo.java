package NgonNguLapTrinhJava;

import java.util.Scanner;

public class KiemTraSoNguyenTo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap so n la so nguyen de kiem tra co la so nguyen to:");
        int num = sc.nextInt();
        if (num < 2) {
            System.out.print("so" + num + "khong phai so nguyen to.");
        } else {
            int i = 2;
            boolean check = true;
            while (i <= Math.sqrt(num)) {
                if (num % i == 0) {
                    check = false;
                    break;
                }
                i++;
            }
            if (check) {
                System.out.print("so" + num + " la so nguyen to.");
            } else {
                System.out.print("so" + num + "khong phai la so nguyen to.");
            }
        }
    }
}
