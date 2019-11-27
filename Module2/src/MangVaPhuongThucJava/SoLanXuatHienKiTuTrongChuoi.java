package MangVaPhuongThucJava;

import java.util.Scanner;

public class SoLanXuatHienKiTuTrongChuoi {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String str="Tran Viet  Dung CodeGym Da Nang";
        int length=str.length();
        int count=0;
        System.out.println("Nhập vào một ký tự :");
        char charVal=scanner.next().charAt(0);
        for (int i=0;i<length;i++) {
            if(charVal==str.charAt(i)){
                count++;
            }
        }
        System.out.println("Có "+count+" chữ "+charVal+" trong chuỗi");

    }
}
