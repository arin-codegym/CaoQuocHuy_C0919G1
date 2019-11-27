package NgonNguLapTrinhJava;

import java.util.Scanner;

public class HienThiSoNguyenTo {
    public static boolean checkPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i < (num - 1); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int count = 0, numbers = 2;
        while (true) {
            if (numbers == 2) {
                System.out.println(numbers);
                count++;
                numbers++;
                continue;
            }
            if (checkPrime(numbers)) {
                System.out.println(numbers);
                count++;
            }

            if (count == 20) {
                break;
            }
            numbers += 2;
        }
    }
}
