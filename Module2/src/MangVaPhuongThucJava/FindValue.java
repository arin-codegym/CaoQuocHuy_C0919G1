package MangVaPhuongThucJava;

import java.util.Scanner;

public class FindValue {
    public static void main(String[] args) {
        System.out.println("The application searches for values in an array");
        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a name's student :");
        String inputName = sc.nextLine();
        boolean isExist = false;
        for (int i = 0; i<students.length; i++) {
            if (students[i].equals(inputName)) {
                System.out.println("Position of the students in the list " + inputName + " is " + (i + 1));
                isExist = true;
                break;
            }
        }
        if (!isExist) {
            System.out.println("Not found " + inputName + " in the list.");
        }
    }
}

