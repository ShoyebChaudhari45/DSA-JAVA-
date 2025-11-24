package arrays;

import java.util.Scanner;

public class removeDuplicates {
    public int removeDuplicate(int[] nums) {

        int i=0;
        for(int j =1;j<nums.length;j++){
        
            if(nums[j]!=nums[i]){
                i++;
                nums[i]=nums[j];

            }


        }
        return i+1;
        
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Size");
        int k = sc.nextInt();
        int nums []= new int[k];
        System.out.println("Enter Your Array Elements");
        for(int i =0;i<k;i++){
            nums[i]=sc.nextInt();
        }

        
 removeDuplicates r = new removeDuplicates();
  int newlentgh= r.removeDuplicate(nums);
System.out.println("Uniuqe Array Elements");
 for (int i = 0; i < newlentgh; i++) {
    System.out.println(nums[i]);
}

    }
} 
    

