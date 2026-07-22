import java.util.Scanner;
public class Day02_014_Find_Common_Odd_Elements {

    public static void findDublicate(int arr1[], int arr2[]) {
        boolean Notfound = false;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] % 2 != 0) {
                for (int j = 0; j < arr2.length; j++) {
                    if (arr1[i] == arr2[j]) {
                        System.out.print(arr1[i] + " ");
                        Notfound = true;
                    }
                }
            }
        }
        if (!Notfound) {
            System.out.print("No common odd elements found.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int arr1[] = new int[n1];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = scanner.nextInt();
        }
        int n2 = scanner.nextInt();
        int arr2[] = new int[n2];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = scanner.nextInt();
        }
        findDublicate(arr1, arr2);
        scanner.close();
    }
}