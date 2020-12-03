package IT20A3B_54813_TranVanHoan;

import java.util.Scanner;

class test {
    private static Scanner nhap;
    public static void main(String[] args) {
        nhap = new Scanner(System.in);
        System.out.print("Nhap mot so : ");
        int a = nhap.nextInt();
        if (a>=0) {
            System.out.print("So ban vua nhap la so nguyen duong !!!");
        } else {
            System.out.print("So ban vua nhap la so nguyen am !!!");
        }
    }
}
