import java.util.Scanner;
public class PrintEven {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number:");
        int n=sc.nextInt();
        for(int i=1; i<=n; i++){
            if(i%2==0){
                System.out.println("print the even 1 to n:"+" "+i);
            }
        }        
    }
}
