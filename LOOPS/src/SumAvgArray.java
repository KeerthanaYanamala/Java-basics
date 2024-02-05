//Create a program to calculate the sum and average of elements in an array using a for loop.
public class SumAvgArray {
    public static void main(String args[]){
        int arr1[]={1,2,3,4,5,6};
        int sum=arr1[0];
        
        double avg=0;
        for(int i=1;i<=arr1.length-1;i++){
           sum=sum + arr1[i];
          avg=(double) sum % arr1.length;
           
        }
        System.out.println(sum);
        System.out.println(avg);
        

    }
    
}
