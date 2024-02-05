//Create a program to print the Fibonacci series up to the nth term using a for loop.
import java.util.Scanner;
public class FibSeries {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter upto to where u require " );
        int n=sc.nextInt();
        int a=0;
        System.out.println(a);
        int b=1;
        System.out.println(b);
        for(int i=1;i<=n;i++){
             int num=a+b;
             a=b;
             b=num;
             System.out.println(num);
             
        }
        sc.close(); 
    }
    
    
}
