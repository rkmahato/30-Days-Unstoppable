import java.util.Scanner;

public class Day02_001_Sum_Of_Array_Elements
{
    public  static int Add (int []arr)
    {
        int sum = 0;
        for (int i =0;i< arr.length;i++)
        {
            sum = sum+arr[i];
        }

        return sum;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Size = scanner.nextInt();
        int [] arr = new int[Size];
        for(int i = 0;i< arr.length;i++)
        {
            arr[i] = scanner.nextInt();
        }

        System.out.println(Add(arr));

    }


}
