public class pattern1 {
    public static void hollow_rectangle(int totalrow,int totalcolumn){
        for(int i=1;i<=totalrow;i++){
            for(int j=1;j<=totalcolumn;j++){
                if(i==1||i==totalrow||j==1||j==totalcolumn){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
    public static void main(String args[]){
        hollow_rectangle(4,5);
    }
}
