import java.util.Scanner;

public class Day02_007_Print_Max_And_Min_Sum_Of_N_Minus_1_Elements
{
    public static int larges(int [] arr)
    {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i]>max)
            {
                max = arr[i];
            }
        }
        return max;
    }

    public static int Min(int [] arr)
    {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i]<min)
            {
                min = arr[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int Size = scanner.nextInt();
        int[] arr = new int[Size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        int sum =0;
        for (int i = 0;i< arr.length;i++)
        {
            sum = sum+arr[i];
        }

        int minimumSum = sum - larges(arr);
        int maximumSum = sum - Min(arr);
        System.out.println(maximumSum);
        System.out.println(minimumSum);
    }
}
