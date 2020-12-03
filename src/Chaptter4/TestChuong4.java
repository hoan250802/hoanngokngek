import java.util.Scanner;

public class TestChuong4 {
    public static void main(String[] args){
        int size;
        Scanner nhap = new Scanner(System.in);
        System.out.print("Nhap do dai cua mang : ");
        size = nhap.nextInt();
        int[] array = new int[size];
        for (int i=0; i<size; i++){
            System.out.print("Nhap vao phan tu thu "+ i +" : ");
            array[i] = nhap.nextInt();
        }
        for (int i=0; i<size; i++){
            System.out.println("Phan tu thu "+i+" : "+array[i]);
        }
    }
}
