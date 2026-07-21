import java.util.Scanner;

public class Day01_005_Print_Multiplication_Table
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 1;i<=10;i++)
        {
            System.out.println(n+" X "+i+" = "+n*i);
        }

    }
}
