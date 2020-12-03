package IT20A3B_54813_TranVanHoan;

import java.util.Scanner;

class Test1 {
    private static Scanner nhap;
    public static void main(String[] args){
        nhap = new Scanner(System.in);
        System.out.print("Nhap mot so bat ki : ");
        int a = nhap.nextInt();
        switch (a) {
            case 1:
                System.out.print("So ban nhap la so mot");
                break;
            case 2:
                System.out.print("So ban nhap la so hai");
                break;
            case 3:
                System.out.print("So ban nhap la so ba");
                break;
            case 4:
                System.out.print("So ban nhap la so bon");
                break;
            case 5:
                System.out.print("So ban nhap la so nam");
                break;
            case 6:
                System.out.print("So ban nhap la so sau");
                break;
            case 7:
                System.out.print("So ban nhap la so bay");
                break;
            case 8:
                System.out.print("So ban nhap la so tam");
                break;
            case 9:
                System.out.print("So ban nhap la so chin");
                break;
        }
    }
}
