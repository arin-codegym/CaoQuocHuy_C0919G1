package CaseStudent.Commons;

import java.util.Scanner;

public class NameException  extends Exception {
    private static final String REGEX = "^([\\p{Lu}]|([\\p{Lu}][\\p{Ll}]{1,}))([\\s]([\\p{Lu}]|[\\p{Lu}][\\p{Ll}]{1,10})){0,6}$";;

    private NameException(String mes){
        super(mes);
    }
    public static void validateNameCustomer() {
        while (true) {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter name Customer: ");
                String name = sc.nextLine();
                sc.nextLine();
                if (!name.matches(REGEX)) {
                    throw new NameException("Name invalid, please try again");
                }
                return;
            } catch (NameException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
}
