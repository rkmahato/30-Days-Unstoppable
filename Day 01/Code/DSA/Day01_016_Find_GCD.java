import java.util.Scanner;

public class Day01_016_Find_GCD
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

        System.out.println(GCD(N1,N2));
    }
}
