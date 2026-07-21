import java.util.Scanner;

public class Day01_015_Print_Common_Factors_Of_N1_And_N2
{
    public  static  void Print(int N,int X)
    {
        int min = 0;
        if (N<X)
        {
            min=N;
        }
        else
        {
            min = X;
        }

        for (int i = 1;i<=min;i++)
        {
            if(N%i==0 && X%i==0)
            {
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int X = scanner.nextInt();

        Print(N,X);
    }
}
