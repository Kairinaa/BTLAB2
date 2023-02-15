import java.util.Scanner;
public class LAB23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so dien da su dung: "); double soDien = sc.nextDouble();
        if(soDien<50) {
            System.out.println("So tien la: "+ (soDien*1000));
        } else {
            System.out.println("So tien la: "+ (50*1000+(soDien-50)*1200));
    }
    }
}