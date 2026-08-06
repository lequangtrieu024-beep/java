import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap n: ");
        int n = sc.nextInt();

        int a = 0;
        int b = 1;

        System.out.println("Day Fibonacci:");

        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");

            int temp = a + b;
            a = b;
            b = temp;
        }

        sc.close();
    }
}