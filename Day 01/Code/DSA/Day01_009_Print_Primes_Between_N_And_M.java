import java.util.Scanner;

public class Day01_009_Print_Primes_Between_N_And_M
{

    public static boolean PrimeCheck (int n)
    {
        if (n<=1)
        {
            return false;
        }
        for(int i = 2;i*i <=n;i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }
    public  static  void Print(int N, int M)
    {
        for (int i = N;i<=M;i++)
        {
            if (PrimeCheck(i))
            {
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();

        Print(N,M);
    }
}
