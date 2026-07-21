import java.util.Scanner;

public class Day01_014_Print_First_N_Common_Multiples_Of_A_And_B
{

    public  static  void Print(int N,int N1,int X)
    {
        int i =0;
        if (N<N1)
        {
            i = N1;
        }
        else
        {
            i = N;
        }

        while (i<X)
        {
            if (i%N==0 && i%N1==0)
            {
                System.out.println(i);
                i++;
            }
            i++;
        }

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int N1 = scanner.nextInt();
        int X = scanner.nextInt();

        Print(N,N1,X);
    }
}
