public class convert1 {
    public static void decToBin(int n)
    {
        int pow=0;
        int bin=0;
        while(n>0)
        {
            int rem=n%2;
            bin=bin+(rem*(int)Math.pow(10,pow));
            pow++;
            n=n/2;
        }
        System.out.println("Binary numbers="+bin);
    }
    public static void main(String[] args)
    {
        decToBin(102);
    }
    
}
