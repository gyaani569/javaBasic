public class convert {
    public static void binToDec(int n)
    {
        int my=n;
        int pow=0;
        int dec=0;
        while(n>0)
        {
            int lastdigit = n%10;
            dec=dec+(lastdigit*(int)Math.pow(2, pow));
            pow++;
            n=n/10;
        }
        System.out.println("Decimal of"+my+"="+dec);
    }
    public static void main(String[] args)
    {
        binToDec(10110110);
    }
    
}
