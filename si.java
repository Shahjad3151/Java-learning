import java.util.Scanner;

public class si {
    public static void main(String args[]){
        int p,r,t;
        float si;
        Scanner obj=new Scanner(System.in);
        System.out.print("enter the profit ");
        p=obj.nextInt();
        System.out.print("enter the rate ");
        r=obj.nextInt();
        System.out.print("enter the time ");
        t=obj.nextInt();
        si=p*r*t/100;
        System.out.print("the value of si is " + si);
        obj.close();
    }
}
