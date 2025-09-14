import java.util.Scanner;

public class Assignment1Program2 {
  public static void main(String[] args) {
    System.out.println("Base Conversion Program");

    Scanner input = new Scanner(System.in);

    System.out.println("Please enter a base (2-9)");
    int base = input.nextInt();

    int maxPerDigit = base - 1;
    int max4DigitNum = 0;

    for(int i = 3; i >= 0; i--) {
      max4DigitNum += maxPerDigit * Math.pow(base, i);
    }
    
    System.out.println("The maximum, 4 digit, base 10 number in base " + base + " is " + max4DigitNum);
    System.out.println("Now, enter a base 10 number in range 0 to " + max4DigitNum + " to convert: ");
    int numToConvert = input.nextInt();

    int remainingValue = numToConvert;

    String convertedNumString = "";

    for(int i = 3; i >= 0; i--) {
      int placeValue = remainingValue / (int)Math.pow(base, i);

      convertedNumString = convertedNumString + placeValue;

      remainingValue = numToConvert % (int)Math.pow(base, i);
    }

    System.out.println(convertedNumString);
  }
}
