import java.util.Scanner;

public class Day01_007_Print_Sum_Of_Factors
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count = 0;
        for (int i = 1;i<=n;i++)
        {
            if (n%i==0)
            {
                count++;
            }
        }

        System.out.println(count);

    }
}
