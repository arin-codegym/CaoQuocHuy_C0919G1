package NgonNguLapTrinhJava;

import java.util.Scanner;

public class UngDungChuyenDoiTienTe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double vnd = 23000;
        System.out.println("nhap so dola:");
        double usd = sc.nextDouble();
        double quydoi=usd*vnd;
        System.out.print("Vnd  :"+quydoi);
    }
}
