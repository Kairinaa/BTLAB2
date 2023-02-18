import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so: "); int scp = sc.nextInt();
        double canBachai = Math.sqrt(scp);
        if(canBachai*canBachai == scp){
            System.out.println("Day la so chinh phuong");
        }
        else {
            System.out.println("Day khong phai la so chinh phuong");
        }
    }
}
