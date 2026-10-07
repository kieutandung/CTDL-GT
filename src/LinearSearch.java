import java.util.Scanner;

public class LinearSearch {
    public static int linearSearch(int[] A, int x) {
        for (int i = 0; i < A.length; i++) {
            if (A[i] == x) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số phân tử n = ");
        int n = sc.nextInt();
        int[] B = new int[n];
        System.out.println("Nhập các phân tử của mảng:");
        for (int i = 0; i < n; i++) {
            B[i] = sc.nextInt();
        }
        System.out.print("Nhập giá trị cần tìm x = ");
        int x = sc.nextInt();
        int result = linearSearch(B, x);
        if (result != -1) {
            System.out.println("Tìm thấy " + x + " tai vị trí " + result);
        } else {
            System.out.println("Không tìm thấy " + x + " trong mảng.");
        }
        sc.close();
    }
}