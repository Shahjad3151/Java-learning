
public class recursion {
    public static void main(String args[]){
        recursion obj =new recursion();               //object of class
        int a=4; int b=9;    
        int d=obj.sum(a,b);
        System.out.println("the sum is " +d);   //calling
    }
    int sum(int a,int b){
    if(b==0)                  //define or declaration    
    return a;
    return 1+sum(a,b-1);    //recursion calling
    } 
}
