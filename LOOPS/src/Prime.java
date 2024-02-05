//Write a Java program to check if a given number is prime using a for loop.
public class Prime {
    public static void main(String args[]){
        for(int i=1;i<=10;i++){
            int count=0;
            for(int j=1;j<=i;j++){
                
                
                if(i%j==0){
                    count=count+1;
                }
                
            }
            if(count == 2){
                System.out.println(i);
            
            }
        }

    }
    
}
