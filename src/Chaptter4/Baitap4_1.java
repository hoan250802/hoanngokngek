package Chaptter4;

import java.util.Scanner;

public class Baitap4_1 {
    private static Scanner nhap;
    public static void main(String[] args){
        nhap = new Scanner(System.in);
        int a[] = new int[101];
        System.out.print("Nhap so phan tu : ");
        int n = nhap.nextInt();
        for (int i=1; i<=n; i++){
            System.out.print("Nhap phan tu thu "+i+" trong mang : ");
            a[i] = nhap.nextInt();
        }
        System.out.print("Cac phan tu co gia tri le trong mang la : ");
        for (int i=1; i<=n; i++){
            if (a[i] % 2 != 0) {
                System.out.print(a[i] + " ");
            }
        }
    }
}
