import java.util.*;
public class getlargest {
    public static int getLargestnum(int number[]){
        int largest = Integer.MIN_VALUE;

        for(int i=0; i<number.length;i++){
            if(largest<number[i]){
                largest=number[i]; 
            }
        }
        return largest;
    }
    public static void main(String[] args){
        int number[] = {1,2,6,3,5};
        System.out.println("the largest value in this array is= "+getLargestnum(number));
    }
}
