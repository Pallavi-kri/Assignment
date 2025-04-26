import java.util.*;
// MaxOf100
public class Assignment1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[100];
        System.out.println("Enter 100 number:");
        for(int i=0;i<100;i++)
        {
            numbers[i]= sc.nextInt();
        }
        int max = findMax(numbers);
        System.out.println("The maximum number is :"+max);

    }
    public static int findMax(int[] arr){
        if(arr == null || arr.length == 0){
            throw new IllegalArgumentException("Array cannot be null or empty");
        }
        int max =arr[0];
        for( int i=1;i<arr.length;i++)
        {
            if(arr[i]> max){
                max=arr[i];
            }
        }
         return max;
    }
    
}
