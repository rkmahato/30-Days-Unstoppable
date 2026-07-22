import java.util.Scanner;

public class Day02_011_Find_Missing_Element {

    public static int findMissingElement(int[] array) {
        int sum = 0;
        int n = array.length + 1;
        int totalSum = n * (n + 1) / 2;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        return totalSum - sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.print(findMissingElement(array));
        scanner.close();
    }
}