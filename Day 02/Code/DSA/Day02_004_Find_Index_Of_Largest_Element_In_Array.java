import java.util.Scanner;

public class Day02_004_Find_Index_Of_Largest_Element_In_Array
{
    public static int largestNum(int [] arr)
    {
        int max = Integer.MIN_VALUE;
        int index = 0;
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i]>max)
            {
                max = arr[i];
                index = i;
            }
        }
        return index;

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Size = scanner.nextInt();
        int[] arr = new int[Size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println(largestNum(arr));

    }
}
