
public class sumtwo {
   
    public static void main(String args[])
    {
        sumtwo obj =new sumtwo();               //object of class
        int a=4; int b=9;
        System.out.println("the sum is " + obj.sum(a,b));   //calling

    }
int sum(int a,int b)
{
    int c;
    c=a+b;                  //define or declaration
    return c;
}
}
