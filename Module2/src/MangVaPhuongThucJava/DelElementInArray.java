package MangVaPhuongThucJava;

import java.util.Arrays;
import java.util.Scanner;

public class DelElementInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {10, 4, 6, 7, 8, 6, 0, 0, 0, 0};
        int index_del;
        System.out.println(" Array integer : {10,4,6,7,8,6,0,0,0,0}");
        System.out.println(" Enter Value you want delete : ");
        int del = sc.nextInt();
        boolean check = false;
        int indexEnd = arr.length - 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == del) {
                index_del = i;
                for (int j = index_del; j < indexEnd; j++) {
                    arr[j] = arr[j + 1];
                }
                arr[indexEnd] = 0;
                indexEnd--;
                check = true;
            }
        }
        if (check) {
            System.out.println(Arrays.toString(arr));
        } else {
            System.out.println(" do not find value in array!!!");
        }
    }
}
