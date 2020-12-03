package Chaptter4;

import java.util.Scanner;

public class Baitao4_4 {
    private static Scanner nhap;

    public static void main(String[] args) {
        nhap = new Scanner(System.in);
        System.out.print("Nhap so hang : ");
        int n = nhap.nextInt();
        System.out.print("Nhap so cot : ");
        int m = nhap.nextInt();
        int a[][] = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("Nhap phan tu [" + i + "," + j + "] : ");
                a[i][j] = nhap.nextInt();
            }
        }
        System.out.println("Mang vua nhap la : ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.print("\n");
        }
        System.out.print("Cac gia tri tren duong cheo chinh cua mang la : ");
        for (int i=0;i<n;i++){
            for (int j=0; j<m; j++) {
                if (i == j) {
                    System.out.print(a[i][j]+" ");
                }
            }
        }
    }
}