public class newpattern{
    public static void main(String[] args){
        for(int i=1;i<=7;i++)
        {
            for(int j=i;j<=7-i+1;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}