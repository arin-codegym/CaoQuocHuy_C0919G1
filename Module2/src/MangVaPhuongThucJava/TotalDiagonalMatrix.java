package MangVaPhuongThucJava;

import java.util.Random;
import java.util.Scanner;

public class TotalDiagonalMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int row;
        int total;
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
        total(row, col, arr2D);
    }
    private static void total(int row, int col, int[][] arr2D) {
        int total = 0;
        for (int i=0;i<row;i++){
            for (int j=0;j<col;j++) {
                System.out.println(arr2D[i][j]+"\t");
                }
            System.out.println("\n");
            }

            System.out.print(total);
        }
}

