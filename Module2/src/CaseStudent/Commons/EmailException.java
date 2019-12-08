package CaseStudent.Commons;

import java.util.Scanner;

public class EmailException extends Exception {
    private static final String REGEX = "^[a-z0-9._-]+@[a-z0-9.-]+\\.[a-z]{2,3}";
    private EmailException(String message) {
        super(message);
    }
    public static String validDateEmail() {
        while (true) {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter email Customer: ");
                String email = sc.nextLine();
                if (!email.matches(REGEX)) {
                    throw new EmailException("Email invalid, please try again");
                }
                return email;
            } catch (EmailException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }

}
