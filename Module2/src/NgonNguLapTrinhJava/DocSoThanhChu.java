package NgonNguLapTrinhJava;

import java.util.Scanner;

public class DocSoThanhChu {
    /**
     * @param num
     * @return ;
     * **/
    public static String docSo1Den10(int num) {
        String n = "";
        switch (num) {
            case 1:
                n = "one";
                break;
            case 2:
                n = "two";
                break;
            case 3:
                n = "three";
                break;
            case 4:
                n = "four";
                break;
            case 5:
                n = "five";
                break;
            case 6:
                n = "six";
                break;
            case 7:
                n = "seven";
                break;
            case 8:
                n = "eight";
                break;
            case 9:
                n = "nine";
                break;
            case 10:
                n = "ten";
                break;
        }
        return n;
    }

    public static String docTu11Den19(int num) {
        String n = "";
        switch (num) {
            case 11:
                n = "eleven";
            case 12:
                n = "twelve";
            case 13:
                n = "thirteen";
            case 14:
                n = "fourteen";
            case 15:
                n = "fifteen";
            case 16:
                n = "sixteen";
            case 17:
                n = "seventeen";
            case 18:
                n = "eighteen";
            case 19:
                n = "nineteen";

        }
        return n;
    }
/**
 * @param num;
 * @return ;
 **/
    public static String docTu20Den29(int num) {
        int n = num%20;
        return "twenty-"+docSo1Den10(n);
    }
    public static String docSo30Den39(int num) {
        int n= num%30;
        return "thirty "+docSo1Den10(n);
    }
    /**
     * methods doc so tu 50 den 59
     * @param num
     * @return ;
     */
    public static String docSo50Den59(int num) {
        int n= num%50;
        return "fifty "+docSo1Den10(n);
    }
    public static String docSo2ChuSo(int num){
        String n;
        int n1=num/10;
        int n2=num%10;
       if (num>=20 && num<29){
           n = docTu20Den29(num);
       }else if (num>=30 && num <39){
           n = docSo30Den39(num);
       }else if (num>=50 && num<59){
           n = docSo50Den59(num);
       }else if (n2 == 0) {
           n=docSo1Den10(n1)+"ty";
       }else {
           n = docSo1Den10(n1)+"ty"+docSo1Den10(n2);
       }
       return n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so vao");
        int num=sc.nextInt();
        if (num>0&&num<11){
            System.out.println(docSo1Den10(num));
        }else if (num>10&&num<20){
            System.out.println(docTu11Den19(num));
        }else if(num>=20 &&num<99){
            System.out.println(docSo2ChuSo(num));
        }else if (num%100==0&&num<1000){
            int n = num/100;
            System.out.println(docSo1Den10(n)+" hundred ");
        }else {
            int tram=num/100;
            int hangchuc=num%100;
            int chuc=hangchuc/10;
            int donvi;
            if (hangchuc>10){
                donvi= chuc % 10;
            }else{
                donvi=hangchuc;
            }
            if (chuc==0){
                System.out.println(docSo1Den10(tram)+" hundred  " + docSo1Den10(donvi));
            }else {
                System.out.println(docSo1Den10(tram)+" hundred  "+docSo2ChuSo(hangchuc) );
            }
        }
    }
}



