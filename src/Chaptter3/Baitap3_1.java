import java.util.Scanner;

public class Baitap3_1 {
    private static Scanner nhap;
    public static void main(String[] args) {
        nhap = new Scanner(System.in);
        System.out.print("Nhap a: ");
        float a = nhap.nextFloat();
        System.out.print("Nhap b: ");
        float b = nhap.nextFloat();
        System.out.println("Ket qua bai toan a + b la : "+(a+b));
        System.out.println("Ket qua bai toan a - b la : "+(a-b));
        System.out.println("Ket qua bai toan a * b la : "+(a*b));
        System.out.println("Ket qua bai toan a / b la : "+ (a/b));
    }
}
