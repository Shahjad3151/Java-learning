public class variableclass {
    int a=9;//instance variable
    static int b=3;//static variable
    public static void main(String args[]){        //variable call static,local,instance
        int c=7;//local variable
        variableclass obj=new variableclass ();
        System.out.println(obj.a);
        System.out.println(b);
        System.out.println(c);
}
}