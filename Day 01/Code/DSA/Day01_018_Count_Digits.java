import java.util.Scanner;

public class Day01_018_Count_Digits
{
    public static int Counting(int n)
    {
        int count =0;
        while (n!=0)
        {
            n = n/10;
            count++;
        }

        return count;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        System.out.println(Counting(n));
    }
}
