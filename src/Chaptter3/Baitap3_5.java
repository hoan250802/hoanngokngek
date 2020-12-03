import java.util.Scanner;

public class Baitap3_5 {
    private static Scanner nhap;
    public static void main(String[] args) {
        nhap = new Scanner(System.in);
        String ten = null;
        String matkhau = null;
        int baomat=1;
        while (baomat<=3) {
            System.out.print("Nhap ten : ");
            ten = nhap.next();
            System.out.print("Nhap mat khau : ");
            matkhau = nhap.next();
            baomat = baomat+1;
            if (ten.equals("Dieu")&& matkhau.equals("1234")){
                System.out.println("Dang dang nhap . . . .");
                break;
            } else {
                System.out.println("Sai ten dang nhap hoac mat khau. Xin vui long nhap lai !");
            }
        }
        int tong = 0;
        System.out.print("So chia het cho 2 va 5 la : ");
        for (int i=100; i<=200; i++) {
            if ((i%3==0) && (i%5==0)) {
                System.out.print(+i+" ");
                tong = tong + i;
            }
        }
        System.out.print("Tong cac so tren la : "+tong);
    }
}
