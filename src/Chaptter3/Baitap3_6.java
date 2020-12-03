import java.util.Scanner;

public class Baitap3_6 {
    private static Scanner nhap;
    public static void main(String[] args) {
        int a=0, b=0, c=0, d=0;
        for (int i=0; i<=100; i++) {
            switch (i%5) {
                case 0: a++;
                break;
                case 1: b++;
                break;
                case 2: c++;
                break;
                case 3: d++;
                break;
            }
        }
        System.out.println("Co "+ a +" so chia het cho 5");
        System.out.println("Co "+ b +" so chia cho 5 du 1");
        System.out.println("Co "+ c + " so chia cho 5 du 2");
        System.out.println("Co "+ d +" so chia cho 5 du 3");
    }
}
