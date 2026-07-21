import java.util.Scanner;

public class Day01_001_Print_Reverse_Numbers
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = n;i>=1;i--)
        {
            System.out.print(i+" ");
        }

    }
}
