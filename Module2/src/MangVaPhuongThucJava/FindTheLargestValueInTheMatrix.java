package MangVaPhuongThucJava;

import com.sun.javafx.collections.MappingChange;

import java.util.Random;
import java.util.Scanner;

public class FindTheLargestValueInTheMatrix {
    private static Object Random;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int row;
        int col;
        System.out.println("Enter row:");
        row = sc.nextInt();
        System.out.println("Enter col:");
        col = sc.nextInt();
        int[][] arr2D = new int[row][col];
        for (int i = 0; i <row ; i++) {
            for (int j = 0; j < col; j++) {
              arr2D[i][j]= random.nextInt(100);
            }
        }
        print(row, col, arr2D);
    }
    static void print(int row, int col, int[][] arr2D) {
        for (int i=0;i<row;i++){
            for (int j=0;j<col;j++) {
                System.out.print(arr2D[i][j]+"\t");
            }
            System.out.print("\n");
        }
        int indexRow=0;
        int indexCol=0;
        int maxValue=arr2D[0][0];
        for (int i=0;i<row;i++) {
            for (int j=0;j<col;j++) {
                if (maxValue<arr2D[i][j]) {
                    maxValue=arr2D[i][j];
                    indexRow=i;
                    indexCol=j;
                }
            }
        }
        System.out.println("Giá trị lớn nhất là: ");
        System.out.println(maxValue+" tại vị trí hàng "+(indexRow+1)+" cột "+(indexCol+1));
    }
}
