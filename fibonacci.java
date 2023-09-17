import java.util.*;
public class fibonacci {
    public static void main(String args[]){
        int n,i,a=0,b=1,c=0;
        System.out.println("enter the value");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        System.out.println("the fibonacci series is :");
         
        for(i=0;i<=n;i++){
           
           System.out.println(a);
            c=a+b;
            a=b;
            b=c;
           
        }
    }
}
