import java.util.Scanner;

public class Baitap3_2 {
    private static Scanner sc;
    public static void main(String[] args) {
        sc = new Scanner(System.in);
        System.out.print("Nhap a: ") ;
        float a = sc.nextFloat();
        System.out.print("Nhap b: ");
        float b = sc.nextFloat();
        System.out.print("Nhap c: ");
        float c = sc.nextFloat();
        float denta = b*b-4*a*c;
        if (a==0) {
            if (b==0) {
                System.out.println("Phuong trinh vo nghiem !");
            } else {
                System.out.println("Phuong trinh co 1 nghiem x = "+ (-c/b));
            }
        } else {
            if (denta<0) {
                System.out.println("Phuong trinh vo nghiem !");
            } else {
                System.out.println("Phuong trinh co 2 nghiem phan biet x1 = "+(-b+Math.sqrt(denta))/(2*a)+" va x2 = "+(-b-Math.sqrt(denta))/(2*a));

            }
        }
    }

}
