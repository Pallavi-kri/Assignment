//java program  to find sum of all digits

import java.util.Scanner;

public class Assignment4 {
    public static long sumofno(int n){
        int a,sum=0;
         while (n!=0) {
            a=n%10;
            n=n/10;
            sum+=a;
         }   
        return sum;
    }
public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);
    System.out.println("Enter a no:");
    int number = obj.nextInt();
    try{
        long result = sumofno(number);
        System.out.println("Sum of digite is:"+result);
    } 
    catch(Exception e){
        System.out.println("Error: " + e.getMessage());
    }
}
}
