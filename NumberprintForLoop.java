import java.util.Scanner;

public class NumberprintForLoop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number:\n");
        int n=sc.nextInt();
        for(int i=1; i<=n; i++){
                System.out.println(+i);
        }    
    }
}
