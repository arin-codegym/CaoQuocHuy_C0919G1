package MangVaPhuongThucJava;

import java.util.Scanner;

public class CountChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap chuoi");
        String string = sc.nextLine();
        System.out.println("nhap ky tu");
        char key_char= sc.next().charAt(0);
        int count=0;
        int length = string.length();
        for (int i = 0; i <length ; i++) {
            if (key_char==string.charAt(i)){
                count++;
            }
        }
        System.out.println(key_char+" xuat hien"+count);
    }
}
