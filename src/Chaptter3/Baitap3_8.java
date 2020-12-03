import java.util.Scanner;

public class Baitap3_8 {
    private static Scanner nhap;

    public static void main(String[] args) {
        nhap = new Scanner(System.in);
        System.out.print("Nhap so nguyen duong n : ");
        int n = nhap.nextInt();
        int u = 0;
        if (kiemtrasonguyento(n)) {
            System.out.println(n + " la so nguyen to");
        } else {
            System.out.println(n + " khong phai la so nguyen to");
        }
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                u++;
            }
        }
        System.out.println("So n co " + u + " uoc so");
        System.out.print("Cac uoc cua n la : ");
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean kiemtrasonguyento(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
