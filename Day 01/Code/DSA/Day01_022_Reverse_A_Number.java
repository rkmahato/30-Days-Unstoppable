import java.util.Scanner;

public class Day01_022_Reverse_A_Number
{
    public static String Reverse(int n)
    {
        String  rev = "";
        while (n!=0)
        {
            int mod = n%10;
            rev = rev+mod;
            n = n/10;
        }

        return  rev;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();


        System.out.println(Reverse(n));
    }
}
