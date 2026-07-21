import java.util.Scanner;

public class Day01_012_Print_Multiples_Of_N_Till_X
{
    public  static  void  Print(int N,int X)
    {
        for (int i = N;i<=X;i++)
        {
            if (i%N==0)
            {
                System.out.print(i+" ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N  = scanner.nextInt();
        int X = scanner.nextInt();

        Print(N,X);
    }
}
