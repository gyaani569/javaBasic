import java.util.Scanner;

public class oddeven1 {
    
    private int sumEven;
    private int sumOdd;
    
    public oddeven1() {
        sumEven = 0;
        sumOdd = 0;
    }
    
    public void oddeven12(int num) {
        if(num % 2 == 0) {
            sumEven += num;
        } else {
            sumOdd += num;
        }
    }
    
    public int getSumEven() {
        return sumEven;
    }
    
    public int getSumOdd() {
        return sumOdd;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        oddeven1 calculator = new oddeven1();
        
        System.out.print("Enter numbers (enter 0 to stop): ");
        int num = scanner.nextInt();
        
        while(num != 0) {
            calculator.oddeven12(num);
            num = scanner.nextInt();
        }
        
        System.out.println("Sum of even numbers: " + calculator.getSumEven());
        System.out.println("Sum of odd numbers: " + calculator.getSumOdd());
        
        scanner.close();
    }

}

