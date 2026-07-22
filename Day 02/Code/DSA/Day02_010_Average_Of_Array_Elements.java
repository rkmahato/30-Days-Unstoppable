import java.util.Scanner;

public class Day02_010_Average_Of_Array_Elements {

    public static float Sum(int[] arr) {
        float sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + (float) arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] arr = new int[N];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        float totalSum = Sum(arr);
        float average = totalSum / N;
        System.out.println(average);

    }
}