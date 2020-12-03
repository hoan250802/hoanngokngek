import java.util.Scanner;

public class Baitap3_11 {
    private static Scanner nhap;
    public static void main(String[] args) {
        nhap = new Scanner(System.in);
        System.out.print("Nhap so can kiem tra : ");
        int a = nhap.nextInt();
        if (kiemtrasochinhphuong(a)) {
            System.out.println("So ban nhap la so chinh phuong");
        } else {
            System.out.println("So ban nhap khong phai la so chinh phuong");
        }
    }

    private static boolean kiemtrasochinhphuong(int a) {
        int b = (int) Math.sqrt(a);
        if (b * b == a) {
            return true;
        } else {
            return false;
        }
    }
}
