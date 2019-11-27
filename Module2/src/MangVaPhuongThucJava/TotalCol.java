package MangVaPhuongThucJava;

import java.util.Random;
import java.util.Scanner;

public class TotalCol {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row;
        int sum = 0;
        int col;
        System.out.println("Enter row:");
        row = sc.nextInt();
        System.out.println("Enter col:");
        col = sc.nextInt();
        int[][] arr2D = new int[row][col];
        for (int i = 0; i < row ; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println(" enter"+"["+(i+1)+"]"+"["+(j+1)+"]");
                arr2D[i][j]=sc.nextInt();
            }
        }
        print(row,col,arr2D);
        System.out.println("chon cot muon tinh:");
        int chooseCol=sc.nextInt();

        for (int i = 0; i <row ; i++) {
            sum+= arr2D[i][chooseCol-1];
        }
        System.out.println("Result:"+sum);

    }
    private static void print(int row, int col, int[][] arr2D) {
        for (int i=0;i<row;i++){
            for (int j=0;j<col;j++) {
                System.out.print(arr2D[i][j]+"\t");
            }
            System.out.print("\n");
        }
    }
}
