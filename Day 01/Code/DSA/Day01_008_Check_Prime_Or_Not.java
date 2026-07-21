import java.util.Scanner;

public class Day01_008_Check_Prime_Or_Not
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
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(PrimeCheck(n));
    }
}
