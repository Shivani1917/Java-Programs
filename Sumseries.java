     // Section C Q3//
import java.util.Scanner;

public class Sumseries {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("University Roll no.:20105023");
        System.out.println("Sum of series of 11+22+33+.....+nn");
        System.out.print("value of terms(n):");
        int n=sc.nextInt();
        int term=0;
        int sum=0;
  
    for(int i=1;i<=n;i++){
        term = i+(i*10);             
        System.out.print(term + " + ");
        sum = sum+term;
    }
     
    System.out.println("");
    System.out.print("Sum of series "+sum);
}
}


