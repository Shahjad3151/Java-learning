/*
import java.util.Scanner;
public class armstrong {
     public static void main(String args[])
    {
        armstrong obj=new armstrong();              
        System.out.println("enter the number");
        Scanner sc=new Scanner(System.in);      
        int q;
        q=sc.nextInt();
        System.out.println(obj.arm(q));
    }
    int arm(int n)
    {
        int r,q,sum=0;
        q=n;
        while(n>0)
        {
            r=n%10;
            sum=sum+r*r*r;
            n=n/10;
        }
        if(q==sum)
        {
            System.out.println(" armstrong");
            return sum;
        }
        else
        {
            System.out.println("not armstrong");
            return sum;
        }
    }
}*/