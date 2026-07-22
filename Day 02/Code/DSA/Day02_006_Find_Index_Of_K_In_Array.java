import java.util.Scanner;

public class Day02_006_Find_Index_Of_K_In_Array
{
    public static int kIndex(int arr[],int k)
    {
        for (int i =0;i< arr.length;i++)
        {
            if (arr[i]==k)
            {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Size = scanner.nextInt();
        int[] arr = new int[Size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        int k = scanner.nextInt();

        System.out.println(kIndex(arr,k));
    }
}
