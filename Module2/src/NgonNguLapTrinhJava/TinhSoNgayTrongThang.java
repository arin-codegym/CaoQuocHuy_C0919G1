package NgonNguLapTrinhJava;

import java.util.Scanner;

public class TinhSoNgayTrongThang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap thang can kiem tra:");
        int month = sc.nextInt();
        switch (month){
            case 2:
                System.out.print("co 28 or 29 ngay");
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 9:
            case 11:
                System.out.print("thang"+month+"co 31 ngay");
                break;
            case 4:
            case 6:
            case 8:
            case 10:
            case 12:
                System.out.print("thang"+month+"co 30 ngay");
                break;
            default:
                System.out.print("thang"+month+"khong ton tai trong nam");
                break;

        }

    }
}
