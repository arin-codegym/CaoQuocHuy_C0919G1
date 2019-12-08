package CaseStudent.Commons;

import java.util.Scanner;

public class  Validation {

    private static Scanner sc;// Scanner sc = new Scanner khong dc khai báo ngoài vòng lặp vì mỗi lần vòng lặp chay sẽ cấp phát bộ nhớ lại dẫn đến lỗi rơi vào vong lặp vô hạn
    //check Name valid
    private static String regex = "^([\\p{Lu}]|([\\p{Lu}][\\p{Ll}]{1,}))([\\s]([\\p{Lu}]|[\\p{Lu}][\\p{Ll}]{1,10})){0,6}$";

    public static boolean checkName(String string) {
        return string.matches(regex);
    }

    //NameException
    public static String NameException(String content, String errorMessage) {
        System.out.println(content);
        sc = new Scanner(System.in);
        while (!sc.nextLine().matches(regex)) {
            System.out.println(errorMessage);
            sc.nextLine();
        }
        return sc.nextLine();
    }

    // check number double
    public static double checkValidNumberDouble(String content, String errorMessage) {
        //boolean error = false;
        while (true) {
            try {
                sc = new Scanner(System.in);// khai báo ở đây tránh tình trạng khi lặp sai bị rơi vào lặp vô hạn vì can phai tạo lại 1 biên để khởi tạo lại vùng nh
                System.out.println(content);
                return sc.nextDouble();
            } catch (Exception ex) {
                System.out.println(errorMessage);
            }
        }
    }


        // check number Integer
        public static Integer checkValidNumberInteger (String content, String errorMessage){
            //boolean error = false;
            while (true) {
                try {
                    sc = new Scanner(System.in);// khai báo ở đây tránh tình trạng khi lặp sai bị rơi vào lặp vô hạn vì can phai tạo lại 1 biên để khởi tạo lại vùng nh
                    System.out.println(content);
                    return sc.nextInt();
                } catch (Exception ex) {
                    System.out.println(errorMessage);
                }
            }
        }



    //check Integer



    }

