import java.util.Scanner;

public class Factorial {
    public static long factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập n = ");
        int n = sc.nextInt();
        if (n < 0) {
            System.out.println("Không tính được giai thừa âm.");
        } else {
            long result = factorial(n);
            System.out.println(n + "! = " + result);
        }
        sc.close();
    }
}