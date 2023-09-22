public class lcm {
    public static void main(String args[])
    {
        int i,hcf=1,n1=4,n2=18,lcm;
        for(i=1;i<=n1 || i<=n2;i++)
        {
            if(n1%i==0 && n2%i==0)
            {
                hcf=i;
              
            }
        }
        lcm=(n1*n2)/hcf;
        System.out.println(lcm);
    }
}
