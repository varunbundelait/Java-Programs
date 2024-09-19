import java.util.Scanner;

public class SeriesPower {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a no:");
        int n=sc.nextInt();
        double sum=0.0;

        int i;
        for(i=1; i<=n; i++){
            sum=sum+Math.pow(i,2);
            //System.out.println("sum of series with power (2):"+" "+sum);
        }
        System.out.println("sum of series with power (2):"+" "+sum);
    }
}

        
  

