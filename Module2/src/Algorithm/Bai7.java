package Algorithm;

import java.util.Scanner;

public class Bai7 {
//    public static void main(String[] args) {
//        // Su dung phuong thuc String de xu ly
////        Scanner sc = new Scanner(System.in);
////        String num;
////        System.out.println("nhap so:");
////        num = sc.nextLine();
////        int S = 0;
////        int P = 1;
////        for (int i = 0; i < num.length(); i++) {
////            S += Integer.parseInt(String.valueOf(num.charAt(i)));
////        }
////        System.out.println(num.charAt(0));
////        System.out.println(num.length());
////        System.out.println("S = " + S);
////        for (int i = 1; i < num.length(); i++) {
////            P *= Integer.parseInt(String.valueOf(num.charAt(i)));
////        }
////        System.out.println("P = " + P);
////    }
//        // giai thuat: vat va vai ra moi lam dung//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("nhap so n:");
//        int n = sc.nextInt();
//        int length = 0;
//        int S = 0;
//        int P = 1;
//        int temp = n;
//        while (n >= 10) {
//            n /= 10;
//            length++;
//        }
//        n = temp;
//        int a = 10;
//        int b;
//        for (int i = 1; i < length; i++) {
//            a *= 10;
//        }
//        //   System.out.println(a);
//        for (int i = 0; i <= length; i++, a /= 10) {
//            b = n / a;
//            S += b;
//            P *= b;
//            n = n % a;
//          //  System.out.println(a);
//        }
//        System.out.println(S);
//        System.out.println(P);
//    }







        public static int nhap(){
            Scanner input= new Scanner(System.in);
            boolean check= false;
            int n=0;
            while(!check){
                System.out.print(" ");
                try{
                    n= input.nextInt();
                    check= true;
                }catch(Exception e){
                    System.out.println("Ban phai nhap so! hay nhap lai...");
                    input.nextLine();
                }
            }
            return (n);
        }
    public static int tinhTong(long i){
        int sum=0;
        long n;
        while(i!=0){
            n= i%10;
            sum+= n;
            i/=10;
        }
        return (sum);
    }
    public static void main(String[] args){
        System.out.print("Nhap n");
        int n= nhap();
        System.out.println("Tong cua so "+n+" = " +tinhTong(n));
    }
}