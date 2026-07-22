import java.util.Scanner;

public class Day02_005_Count_Occurrences_Of_K_In_Array
{
    public  static  int Counting(int [] arr,int k)
    {
        int count = 0;
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i]==k)
            {
                count++;
            }

        }
        return  count;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Size = scanner.nextInt();
        int[] arr = new int[Size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        int k = scanner.nextInt();

        System.out.println(Counting(arr,k));
    }
}
