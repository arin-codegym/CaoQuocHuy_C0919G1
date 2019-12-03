package CaseStudent.Commons;

import java.util.Scanner;

public class EmailException extends Exception {
    private static final String REGEX = "^[a-z0-9._-]+@[a-z0-9.-]+\\.[a-z]{2,3}";
    private EmailException(String message) {
        super(message);
    }
    public static void validDateEmail() throws EmailException{
        while (true) {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter name Customer: ");
                String name = sc.nextLine();
                if (!name.matches(REGEX)) {
                    throw new EmailException("Email invalid, please try again");
                }
                return;
            } catch (EmailException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }

}
