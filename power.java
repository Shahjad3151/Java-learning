
import java.util.Scanner;

public class power {
    public static void main(String args[]){
        int i,n,p=1,s;
        System.out.println("enter the number");         //power 
        Scanner sc = new Scanner(System.in);
            n=sc.nextInt();
        System.out.println("enter the power value");         
            s=sc.nextInt();
        for(i=1;i<=s;i++)
        {
            p=p*n;
        }

        System.out.println("power is "+ p); 
}
}

