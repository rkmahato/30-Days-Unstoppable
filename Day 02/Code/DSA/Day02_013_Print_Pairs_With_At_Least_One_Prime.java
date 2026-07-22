import java.util.Scanner;

public class Day02_013_Print_Pairs_With_At_Least_One_Prime {

    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (isPrime(arr[i]) || isPrime(arr[j])) {
                    System.out.print(arr[i] + " " + arr[j]);
                    System.out.println();
                }
            }
        }
        scanner.close();
    }
}