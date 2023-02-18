import java.util.Scanner;

public class test5 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Nhap n bat ky: "); int n = sc.nextInt();
            if (n == 0)
            {
                System.out.println(n + "! = 1");
            }
            else
            {
                int gt=1;
                int i=2;
                do {
                    gt = gt*i;
                    i++;
                }
                while(i <= n);
                System.out.println(n + "! = " + gt);
            }
        }
}
