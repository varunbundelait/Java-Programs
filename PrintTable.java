import java.util.Scanner;

public class PrintTable {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Print Table");
        System.out.println("enter a number:\n");
        int n=sc.nextInt();
        for(int i=1; i<=10; i++){
            System.out.println(n+"*"+i+"="+n*i);
        }
    }
}
