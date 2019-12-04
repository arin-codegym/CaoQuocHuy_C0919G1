package CaseStudent.Commons;

import java.util.Scanner;

public class GenderException extends Exception {
    private GenderException(String message) {
        super(message);
    }

    private static String chuanHoaString(String string) {
        String temp = "";
        temp += Character.toUpperCase(string.charAt(0)) + string.substring(1, string.length()).toLowerCase();
        return temp;

    }

    public static String validGender(String content, String err) throws GenderException {

        System.out.println(content);
        Scanner sc = new Scanner(System.in);
        String gender = sc.nextLine();
        if (gender.toLowerCase().equals("male") || gender.toLowerCase().equals("female")
                || gender.toLowerCase().equals("unknown")) {
            chuanHoaString(gender);
            return gender;
        } else {
            throw new GenderException(err);

        }
    }
}
