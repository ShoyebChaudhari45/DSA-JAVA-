package arrays;
import java.util.Scanner;
public class second_largest {
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the Size of the Array ");
int n = sc.nextInt();
int arr [] = new int[n];
System.out.println("Enter the Elements of the Array ");
for(int i =0;i<n;i++){
    arr[i]=sc.nextInt();
}

int largest =-1;
int secondl = arr[0];
for(int i = 1;i<n;i++){
    if(arr[i]<largest && arr[i]>secondl){
        secondl=arr[i];


    } else if(arr[i]>largest){
        secondl= largest;
        largest= arr[i];


    }
     
} 
System.out.println("Second Largest element "+secondl);

}
    
}
