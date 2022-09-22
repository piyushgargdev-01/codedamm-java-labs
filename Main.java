import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
       Scanner scanner = new Scanner(System.in);

       int a, b; // Declare two variables

       System.out.print("Enter value of a: ");
       a = scanner.nextInt();
       
       System.out.print("Enter value of b: ");
       b = scanner.nextInt();

       System.out.println("Addition: " + (a + b));
       System.out.println("Subtract: " + (b - a));
       System.out.println("Multiply: " + (a * b));
       System.out.println("Divide: " + (b / a));
      
        
    }
}