import java.util.Scanner;

public class Baitap3_7 {
    private static Scanner nhap;
    public static void main(String[] args){
        nhap = new Scanner(System.in);
        System.out.print("Nhap so a : ");
        int a=nhap.nextInt();
        System.out.print("Nhap so b : ");
        int b=nhap.nextInt();
        int x;
        if (a==0) {
            System.out.println("Phuong trinh vo nghiem !");
        } else {
            x = (-b/a);
            System.out.println("Phuong trinh co nghiem x = "+x);
        }
    }
}
