import java.util.Scanner;
import java.util.Random;

public class Assignment1Program1 {
  public static void main(String[] args) {
    System.out.println("  CCCCC         A    ");
    System.out.println(" CCCCCCC       AAA   ");
    System.out.println("CCC    CC     AA AA  ");
    System.out.println("CC           AA   AA ");
    System.out.println("CC          AAAAAAAAA");
    System.out.println("CC          AA     AA");
    System.out.println("CCC    CC   AA     AA");
    System.out.println(" CCCCCCC    AA     AA");
    System.out.println("  CCCCC     AA     AA");

    Scanner input = new Scanner(System.in);
    
    System.out.println("Please enter a 5-character string: ");
    String userString = input.nextLine();

    String clippedString;
    clippedString = userString.substring(1, 4);
    
    StringBuilder stringBuilder = new StringBuilder(clippedString);
    String finalString = stringBuilder.reverse().toString();

    System.out.println("Please enter a number in Fahrenheit: ");
    int tempInFahrenheit = input.nextInt();

    double tempInCelsius = ((double)tempInFahrenheit - 32.0) * (5.0 / 9.0);

    Random randGenerator = new Random();
    int randNum = randGenerator.nextInt((16384 - 32) + 1) + 32;

    System.out.println(randNum);

    input.close();
  }
}
