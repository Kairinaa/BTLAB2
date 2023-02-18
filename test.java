import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao so diem: "); double diem = sc.nextDouble();
        if (diem < 5) {
            System.out.println("Xep loai kem");
        } else if (diem < 7) {
            System.out.println("Xep loai trung binh");
        } else if (diem < 8) {
            System.out.println("Xep loai kha");
        }
        else {
            System.out.println("Xep loai gioi");
        }
    }
}
