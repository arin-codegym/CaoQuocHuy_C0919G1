package MangVaPhuongThucJava;

import javax.swing.*;
import java.util.Arrays;
import java.util.Scanner;

public class AddElementInArray {
    public static void main(String[] args) {
        int[] array = {10, 4, 6, 7, 8, 0, 0, 0, 0, 0};
        System.out.println("Enter X value you want insert:");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println("Enter index you want insert in array :");
        int index = sc.nextInt();
        if (index <= 1 || index >= array.length - 1) {
            System.out.println("Can't insert !!!");
        }
        int[] arrayUpload = new int[array.length + 1];
        int dich = array.length - 1;
        for (int i = 0; i < index; i++) {
            arrayUpload[i] = array[i];
        }
        for (int j = (arrayUpload.length - 1); j > index; j--, dich--) {
            arrayUpload[j] = array[dich];
        }
        arrayUpload[index] = x;
//
        System.out.println(Arrays.toString(arrayUpload));
    }

}
