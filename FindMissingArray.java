import java.util.Scanner;

public class FindMissingArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the total number of elements\n");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the number of elements in array:\n");
        for(int i=0; i<n; i++){
           arr[i]=sc.nextInt();
        }
        int sum=(n+1)*(n+2)/2;
        for(int i=0; i<n; i++){
            sum=sum-arr[i];
        }
        System.out.println("Missing Elements in array:"+" "+sum);
    }
}
