import java.util.Scanner;

public class Day01_011_Print_Nth_Prime_Number
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
    public static int Nth_Prime(int count)
    {
        int num = 0;
        int i = 1;
        int lastPrime = 0;
        while (num<count)
        {
            if (PrimeCheck(i))
            {
                lastPrime = i;
                num++;
            }
            i++;
        }

        return lastPrime;


    }
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int Nth_Number = scanner.nextInt();

        System.out.println(Nth_Prime(Nth_Number));
    }
}
