public class paremetrized {
    public static void main(String args[]){
        A obj=new A(10,"hello");
        obj.show();

    }
}
class A{
    int x;
    String y;
    A(int a,String b){     //parametrised constructor
        x=a;
        y=b;
        
    }
    void show(){
        System.out.println(x+" "+y);
    }
}
