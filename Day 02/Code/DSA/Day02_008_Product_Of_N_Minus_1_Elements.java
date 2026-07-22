import java.util.Scanner;

public class Day02_008_Product_Of_N_Minus_1_Elements
{
    public  static  int Product(int [] arr)
    {
        int product = 1;
        for(int i =0 ;i< arr.length;i++)
        {
            product = product*arr[i];
        }
        return product;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Size = scanner.nextInt();
        int[] arr = new int[Size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        int p = Product(arr);
        for (int i = 0;i< arr.length;i++)
        {
            System.out.println(p/arr[i]);
        }
    }
}
