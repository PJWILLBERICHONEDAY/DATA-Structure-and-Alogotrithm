package Arrays;

import java.util.Scanner;

public class EQUILBRIUM_ARRAY {
	public static boolean isPossible(int[] arr, int n) {
        int count = 0;
        for (int M = 0; M < n - 1; M++) {
            if (arr[M] > arr[M + 1]) {
                count++;
                if (count > 1) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        for (int i = 0; i < c; i++) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
            }
            boolean result = isPossible(arr, n);
            System.out.println(result);
        }
    }

}
