import java.util.Scanner;

public class Day01_017_Find_LCM
{
    public static int GCD(int N1,int N2)
    {
        while (N1!=N2)
        {
            if (N1<N2)
            {
                N2 = N2-N1;
            }
            else
            {
                N1 = N1-N2;
            }
        }
        return N1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N1 = scanner.nextInt();
        int N2 = scanner.nextInt();

        int gcd = GCD(N1,N2);

        int lcm = (N1*N2)/gcd;
        System.out.println(lcm);

    }
}
