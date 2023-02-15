import java.util.Scanner;
public class LAB21 {
    public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao a: "); double a = sc.nextDouble();
        System.out.println("Nhap vao b: "); double b = sc.nextDouble();
        if(a == 0 && b == 0) {
            System.out.println("Vo so nghiem");
        }else if (a == 0 && b != 0) {
            System.out.println("Vo nghiem");
        }
        else {
            double x;
            x = -b/a;
            System.out.println("Nghiem cua phuong trinh la: "+ x);
        }
    }
}