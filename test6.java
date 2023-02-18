import java.util.Scanner;

public class test6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == 0)
        {
            System.out.println(n + "! = 1");
        }
        else {
            int gt = 1;
            int i = 2;
            do {
                i++;
                gt = gt * i;
            }
            while (i <= n);
            System.out.println(n + "= !"+ gt);
        }
    }
}
