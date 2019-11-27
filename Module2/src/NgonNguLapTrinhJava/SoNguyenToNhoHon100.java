package NgonNguLapTrinhJava;

public class SoNguyenToNhoHon100 {
    public static boolean checkPrime(int num) {
        boolean check = true;
        if (num < 2) {
            check = false;
        } else {
            int i = 2;
            while (i <= Math.sqrt(num)) {
                if (num % i == 0) {
                    check = false;
                    break;
                }
                i++;
            }
        }
        return check;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            if (checkPrime(i)) {
                System.out.println(i);
            }
        }
    }

}



