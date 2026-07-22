import java.util.Scanner;

public class Day02_012_Find_Minimum_Sum_Of_Two_Elements {

    public static int minSum(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int sum = arr[i] + arr[j];
                if (min > sum) {
                    min = sum;
                }
            }
        }
        return min;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.print(minSum(arr));
        scanner.close();
    }
}