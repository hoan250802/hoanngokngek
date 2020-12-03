package Chaptter4;

import java.util.Scanner;

public class Baitap4_3 {
    private static Scanner nhap;
    public static void main(String[] args){
        nhap = new Scanner(System.in);
        System.out.print("Nhap so phan tu cua mang : ");
        int n = nhap.nextInt();
        int a[] = new int [n];
        for (int i=0; i<n; i++){
            System.out.print("Nhap phan tu thu "+i+" cua mang : ");
            a[i] = nhap.nextInt();
        }
        System.out.print("Mang vua nhap la : ");
        for (int i=0; i<n; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
        System.out.print("Cac phan tu la so chinh phuong cua mang la : ");
        for (int i=0; i<n; i++) {
            if (checksochinhphuong(a[i])) {
                System.out.print(a[i] + " ");
            }
        }
    }
    public static boolean checksochinhphuong (double x){
        double h = Math.sqrt(x);
        return ((h-Math.floor(h)==0));
    }
}
