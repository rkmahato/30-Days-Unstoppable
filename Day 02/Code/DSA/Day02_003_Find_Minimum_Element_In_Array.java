import java.util.Scanner;

public class Day02_003_Find_Minimum_Element_In_Array
{
    public static int MinNum(int [] arr)
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
        System.out.println(MinNum(arr));
    }
}
