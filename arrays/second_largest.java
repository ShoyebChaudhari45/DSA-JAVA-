package arrays;
import java.util.Scanner;

public class second_largest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Size of the Array ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter the Elements of the Array ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {

            if (arr[i] > largest) {
                secondLargest = largest;  // previous largest becomes second
                largest = arr[i];
            }

            else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }

        System.out.println("Second Largest Element is: " + secondLargest);
        sc.close();
    }
}
