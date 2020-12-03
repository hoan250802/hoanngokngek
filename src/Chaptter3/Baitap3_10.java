import java.util.Scanner;

public class Baitap3_10 {
    private static Scanner nhap;

    public static void main(String[] args) {
        nhap = new Scanner(System.in);
        System.out.print("Nhap so nguyen duong n : ");
        int n = nhap.nextInt();
        int u = 0;
        if (isPrime(n)) {
            System.out.println(n + " la so nguyen to");
        } else {
            System.out.println(n + " khong phai la so nguyen to");
        }
    }
    public static boolean isPrime(int n) {
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
