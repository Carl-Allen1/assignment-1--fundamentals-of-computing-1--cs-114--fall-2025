import java.util.Scanner;

public class Assignment1Program2 {
  public static void main(String[] args) {
    System.out.println("Base Conversion Program");

    Scanner input = new Scanner(System.in);

    System.out.println("Please enter a base (2-9)");
    int base = input.nextInt();

    int maxPerDigit = base - 1;
    double max4DigitNum = 0;

    for(int i = 3; i >= 0; i--) {
      max4DigitNum += maxPerDigit * Math.pow(base, i);
    }
      
    System.out.println("Now, enter a base 10 number in range 0 to " + (int)max4DigitNum + " to convert: ");
    int numToConvert = input.nextInt();
  }
}
