package arrays;

import java.util.Scanner;

public class is_arr_sorted {
    public static void main(String args[]) {
        System.out.println("Enter Array size");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int nums[] = new int[size];

        // input in array
        for (int i = 0; i < size; i++) {
            nums[i] = sc.nextInt();
        }

        boolean sorted = true;  // added flag

        for (int i = 0; i < size - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                sorted = false;   // mark unsorted
                break;            // stop checking
            }
        }

        if (sorted) {
            System.out.print("Array is sorted ");
        } else {
            System.out.print("Array is not sorted ");
        }

        sc.close();
    }
}
