package IT20A3B_54813_TranVanHoan;

import java.util.Scanner;

public class Test_bai4 {
    private static Scanner nhap;
    public static void main(String[] args) {
        nhap = new Scanner(System.in);
        System.out.println("Nhap 3 canh cua tam giac :");
        System.out.print("a = ");
        int a = nhap.nextInt();
        System.out.print("b = ");
        int b = nhap.nextInt();
        System.out.print("c = ");
        int c = nhap.nextInt();
        if (a*a+b*b==c*c){
            System.out.println("Day la 3 canh tam giac vuong");
        } else if (a*a+c*c==b*b) {
            System.out.println("Day la 3 canh tam giac vuong");
        } else if (b*b+c*c==a*a) {
            System.out.println("Day la 3 canh tam giac vuong");
        } else {
            System.out.println("Day khong phai 3 canh tam giac vuong");
        }
    }
}
