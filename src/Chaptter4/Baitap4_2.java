package Chaptter4;

import java.util.Scanner;

public class Baitap4_2 {
    private static Scanner nhap;
    public static void main(String[] args){
        nhap = new Scanner(System.in);
        System.out.print("Hay nhap so dong : ");
        int n = nhap.nextInt();
        System.out.print("Hay nhap so cot : ");
        int m = nhap.nextInt();
        int a[][] = new int[n][m];
        for (int i = 0; i< n; i++){
            for (int j=0; j<m; j++){
                System.out.print("Nhap phan tu thu ["+i+","+j+"] : ");
                a[i][j] = nhap.nextInt();
            }
        }
        System.out.println("Mang vua nhap la : ");
        for (int i =0; i<n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println("\n");
        }
    }
}
