
public class sumtwo {
    int c;   // instance or non static  variable 
    public static void main(String args[])
    {
        sumtwo obj =new sumtwo();
        int a=4; int b=9;
        System.out.println("the sum is " + obj.sum(a,b));

    }
int sum(int a,int b)
{
    c=a+b;
    return c;
}
}
