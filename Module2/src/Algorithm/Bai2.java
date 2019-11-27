package Algorithm;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao thang: ");
        int month = sc.nextInt();
        while (month > 12) {
            System.out.println("nhap lai thang");
            month = sc.nextInt();
        }
        System.out.println("nhap vao nam: ");
        int year = sc.nextInt();
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("31 ngay.");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("30 ngay.");
            case 2:
                check(year);
                break;
            default:
                break;
        }
    }
    public static void check(int year) {
        boolean isLeapYear = false;
        boolean isDivisibleBy4 = year % 4 == 0;
        if (isDivisibleBy4) {
            boolean isDivisibleBy100 = year % 100 == 0;
            if (isDivisibleBy100) {
                boolean isDivisibleBy400 = year % 400 == 0;
                if (isDivisibleBy400) {
                    isLeapYear = true;
                } else {
                    isLeapYear = true;
                }
            }
        }
        if (isLeapYear) {
            System.out.printf("29 ngay", year);
        } else {
            System.out.printf("28 ngay", year);
        }
    }

}


