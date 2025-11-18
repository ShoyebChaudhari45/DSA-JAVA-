package arrays;
import java.util.Scanner;

public class largest_number {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int largest = arr[0];  // ✅ correct initialization

        for (int i = 1; i < n; i++) {  // start from second element
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }

        System.out.println("Largest number is: " + largest);
        sc.close();
    }
}
