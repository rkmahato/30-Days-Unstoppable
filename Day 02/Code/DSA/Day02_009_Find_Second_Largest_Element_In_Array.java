import java.util.Scanner;

    public class Day02_009_Find_Second_Largest_Element_In_Array
    {
        public static int SecondlargestNum(int [] arr)
        {
            int max = Integer.MIN_VALUE;
            int max2 = Integer.MIN_VALUE;
            for (int i = 0; i < arr.length; i++)
            {
                if (arr[i]>max)
                {
                    max2 = max;
                    max = arr[i];
                }
            }
            for (int i = 0;i< arr.length;i++)
            {
                if(arr[i]>max2 && arr[i]!=max)
                {
                    max2 = arr[i];
                }
            }
            return max2;
        }
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int Size = scanner.nextInt();
            int[] arr = new int[Size];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = scanner.nextInt();
            }
            System.out.println(SecondlargestNum(arr));
        }
    }

