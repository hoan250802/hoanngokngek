import java.util.Scanner;

public class Baitap3_4 {
    private static Scanner nhap;
    public static void main(String[] args) {
        nhap = new Scanner(System.in);
        System.out.print("Lua chon cua nguoi choi 1 ( keo-1, bua-2, bao-3 ) ");
        int a = nhap.nextInt();
        System.out.print("Lua chon cua nguoi choi 2 ( keo-1, bua-2, bao-3 ) ");
        int b = nhap.nextInt();
        if (a==1) {
            switch (b) {
                case 1: System.out.println("Hoa nhau");
                break;
                case 2: System.out.println("Nguoi choi 2 thang");
                break;
                case 3: System.out.println("Nguoi choi 1 thang");
                break;
            }
        } else if (a==2) {
            switch (b) {
                case 1: System.out.println("Nguoi choi 2 thang");
                break;
                case 2: System.out.println("Hoa nhau");
                break;
                case 3: System.out.println("Nguoi choi 1 thang");
                break;
            }
        } else if (a==3) {
            switch (b) {
                case 1: System.out.println("Nguoi choi 2 thang");
                break;
                case 2: System.out.println("Nguoi choi 1 thang");
                break;
                case 3: System.out.println("Hoa nhau");
                break;
            }
        }
    }
}
