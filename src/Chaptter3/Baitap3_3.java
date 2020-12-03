import java.util.Scanner;

public class Baitap3_3 {
    private static Scanner input;
    public static void main(String[] args) {
        input = new Scanner(System.in);
        System.out.print("Nhap n : ");
        float n = input.nextFloat();
        int tong = 0;
        for (int i=0; i<=n;i++) {
            if (i%2==0) {
                tong = tong+i;
            }
        }
        System.out.println("Tong cac so chan tu 0 den n la : " +tong);
    }

}
