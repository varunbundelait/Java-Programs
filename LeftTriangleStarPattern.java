import java.util.Scanner;

/**
 * LeftTriangleStarPattern
 */
public class LeftTriangleStarPattern {

    public static void main(String[] args) {
        int i, j;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number:\n");
        int n=sc.nextInt();
        for (i=0; i<n; i++)   
        {  
        //inner loop work for space      
        for (j=2*(n-i); j>=0; j--)         
        {  
        //prints space between two stars      
        System.out.print(" ");   
        }   
        //inner loop for columns  
        for (j=0; j<=i; j++ )   
        {   
        //prints star      
        System.out.print("* ");   
        }   
        //throws the cursor in a new line after printing each line  
        System.out.println();   
        }   
    
    }
}