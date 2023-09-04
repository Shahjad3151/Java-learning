import java.util.Scanner;

public class oddeven {
     public static void main(String args[]){
        int a;        
        Scanner obj = new Scanner(System.in);     
        System.out.print("enter the number "); 
        a=obj.nextInt();
    
         if (a%2==0)                      // odd even number and also divisiblity check
        {
            System.out.print("even number " + a);
        }
        else
        {
            System.out.print("odd number "+ a);
        }
        obj.close();
}
}