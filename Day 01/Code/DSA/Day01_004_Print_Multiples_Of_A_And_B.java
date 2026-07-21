import java.util.Scanner;

public class Day01_004_Print_Multiples_Of_A_And_B
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        for (int i =1;i<=n;i++)
        {
            if (i%a==0 || i%b==0)
            {
                System.out.println(i);
            }
        }
    }
}
