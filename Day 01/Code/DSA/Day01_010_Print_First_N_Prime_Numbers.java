import java.util.Scanner;

public class Day01_010_Print_First_N_Prime_Numbers
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

    public static void Print(int count)
    {
        int num = 0;
        int i = 1;
        while (num<count)
        {
            if (PrimeCheck(i))
            {
                System.out.println(i);
                num++;
            }
            i++;
        }

    }
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();

        Print(count);
    }

}
