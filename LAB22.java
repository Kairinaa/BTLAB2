import java.util.Scanner;
import java.lang.Math;
public class LAB22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao a: "); double a = sc.nextDouble();
        System.out.println("Nhap vao b: "); double b = sc.nextDouble();
        System.out.println("Nhap vao c: "); double c = sc.nextDouble();
        double x1, x2, delta, xkep;
        if (a == 0 & b == 0) {
                System.out.println("Phuong trinh vo nghiem");
            } else if (b == 0 && c == 0) {
                System.out.println("Phuong trinh co vo so nghiem");
            } else {
                System.out.println("Nghiem cua phuong trinh = "+ (-c/b));
        }
            delta = b * b - a * c * 4;
            if(delta < 0) {
                System.out.println("PT vo nghiem");
            } else if (delta == 0) {
                xkep =  -b/(2*a);
                System.out.println("Nghiem kep cua phuong trinh: "+ xkep);
            } else {
                x1 = (-b + Math.sqrt(delta)) / (2*a);
                x2 = (-b - Math.sqrt(delta)) / (2*a);
                System.out.println("Nghiem phan biet");
                System.out.println(x1);
                System.out.println(x2);
            }
        }
}