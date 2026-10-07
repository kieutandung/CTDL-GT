import java.util.Scanner;

public class InsertionSort {

//    Mã giả:
//    LinearSearch(A, n, x):
//            for i ← 0 to n - 1 do
//            if A[i] = x then
//            return i
//    return -1

    public static void insertionSort(int[] A) {
        for (int i = 1; i < A.length; i++) {
            int key = A[i];
            int j = i - 1;
            while (j >= 0 && A[j] > key) {
                A[j + 1] = A[j];
                j--;
            }
            A[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số phân tử n = ");
        int n = sc.nextInt();
        int[] A = new int[n];
        System.out.println("Nhập các phân tử của mảng:");
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }
        insertionSort(A);
        System.out.println("Mảng sau khi được xếp tăng dần:");
        for (int i = 0; i < n; i++) {
            System.out.print(A[i] + " ");
        }
        sc.close();
    }
}