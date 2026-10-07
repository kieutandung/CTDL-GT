import java.util.Scanner;

public class Factorial {

//    Mã giả:
//    InsertionSort(A, n):
//            for i ← 1 to n - 1 do
//    key ← A[i]
//    j ← i - 1
//
//            while j ≥ 0 và A[j] > key do
//    A[j + 1] ← A[j]
//    j ← j - 1
//
//    A[j + 1] ← key

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