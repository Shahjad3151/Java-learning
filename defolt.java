public class defolt{
    public static void main(String args[]){
        A obj=new A();
        obj.show();

    }
}
 class A {
    int a;
    String b;
    boolean c;
    A(){
        a=10;
        b="hello";
        c=true;
    }
    void show(){
        System.out.println(a+" "+b+" "+c);
    }
}
