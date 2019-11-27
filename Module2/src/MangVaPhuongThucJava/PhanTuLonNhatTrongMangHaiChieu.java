package MangVaPhuongThucJava;

import java.util.Scanner;

public class PhanTuLonNhatTrongMangHaiChieu {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int row;
        int col;
        System.out.print("Nhập vào số hàng :");
        row=scanner.nextInt();
        System.out.print("Nhập vào số cột :");
        col=scanner.nextInt();
        int[][] arr=new int[row][col];
        for (int i=0;i<row;i++) {
            for (int j=0;j<col;j++) {
                System.out.println("enter arr["+i+"]["+j+"]: ");
                arr[i][j]=scanner.nextInt();
            }
        }
        System.out.println("mảng hai chiều đã nhập");
        FindTheLargestValueInTheMatrix.print(row, col, arr);
    }
}
