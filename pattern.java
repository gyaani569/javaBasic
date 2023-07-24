import java.util.*;
public class pattern
{
    public static int  factorial(int n)
    {
        int fact=1;
        for(int i=1;i<=n;i++){
           fact = fact*i; 
        }
        return fact;
    }
    public static int binomialcoff(int n,int r)
    {
        int fact_n=factorial(n);
        int fact_r=factorial(r);
        int fact_nmr=factorial(n-r);

        int binomialcoff=fact_n/(fact_r*fact_nmr);
        return binomialcoff;

    }
    public static void main (String[] args)
    {
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter the value of a=");
       int a=sc.nextInt();
       System.out.print("Enter the value of b=");
       int b=sc.nextInt();
       int b_coff=binomialcoff(a, b);
       System.out.println("The binomial cofficient is=" + b_coff);
      
    }

}