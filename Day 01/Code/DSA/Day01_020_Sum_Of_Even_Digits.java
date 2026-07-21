import java.util.Scanner;

public class Day01_020_Sum_Of_Even_Digits
{
    public static int Add(int n)
    {
        int sum = 0;
        while (n!=0)
        {
            int mod = n%10;
            if (mod%2==0)
            {
                sum = sum+mod;
            }
            n = n/10;

        }

        return sum;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        System.out.println(Add(n));
    }
}
