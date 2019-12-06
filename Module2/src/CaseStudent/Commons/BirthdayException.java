package CaseStudent.Commons;

import java.util.Scanner;

public class BirthdayException extends Exception {
    private static final String REGEX = "^([0-2][0-9]|(3)[0-1])(/)(((0)[0-9])|((1)[0-2]))(/)\\d{4}$";

    private BirthdayException(String errMes) {
        super(errMes);
    }

    private static boolean checkBirthday(String str) {
        return str.matches(REGEX);
    }

    public static String validBirthDay(String strDisplay, String errMes) throws BirthdayException {
        Scanner sc = new Scanner(System.in);
        System.out.println(strDisplay);
        while (true){
            try{
                String birthDay = sc.nextLine();
                if (!birthDay.matches(REGEX)){
                    throw new BirthdayException(errMes);
                }
                return birthDay;
            }catch (BirthdayException ex){
               // System.out.println(ex.getMessage());
            }
        }
    }
}

