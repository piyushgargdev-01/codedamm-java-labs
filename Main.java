import java.util.Scanner;

public class Main {

  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);

    int x, y, result = 0;
    char ch;

    System.out.print("Enter value for x: ");
    x = scanner.nextInt();

    System.out.print("Enter value for y: ");
    y = scanner.nextInt();

    System.out.print("Enter a symbol ( +, -, * ): ");
    ch = scanner.next().charAt(0);

    switch (ch) {
      case '+':
        result = x + y;
        break;
      case '-':
        result = x - y;
        break;
      case '*':
        result = x * y;
        break;
      default:
        System.out.println("Invalid Option");
    }

    System.out.println("Result: " + result);
  }
}
