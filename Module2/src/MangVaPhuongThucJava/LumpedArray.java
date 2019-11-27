package MangVaPhuongThucJava;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Scanner;

public class LumpedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []arr1 = new int[5];
        int []arr2 = new int[5];
        int []arr3 = new int[arr1.length+arr2.length];
        int length = arr1.length;
        System.out.println("Enter element in array 1:");
        for (int i = 0; i <arr1.length ; i++) {
            System.out.println("enter element "+(i+1)+"is :");
            arr1[i]=sc.nextInt();
            System.out.println();
            arr3[i]=arr1[i];
        }
        System.out.println("Enter element in array 2:");
        for (int i = 0; i <arr2.length ; i++) {
            System.out.println("enter element "+(i+1)+" is :");
            arr2[i]=sc.nextInt();
            System.out.println();
            arr3[length]=arr2[i];
            length++;
        }
        for (int element:arr3) {
            System.out.println(element);
        }
    }

}
