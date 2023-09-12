
import java.util.Scanner;

public class prime{
    public static void main(String args[]){
    int n,i,j,count;
    System.out.println("enter number");
    Scanner obj=new Scanner(System.in);
    n=obj.nextInt();
      
       for(i=2;i<=n;i++)
       {
        count=0;
        for(j=2;j<i;j++)
        {
        if(i%j==0)
        {
            count++;
            break;
        }
        }       
       if(count==0)
       {
        System.out.println(i);
       }
    }
    }
}