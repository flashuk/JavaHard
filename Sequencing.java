import java.util.Scanner;

public class Sequencing{
  public static void main(String[] args) {
    double price = 0, salestax, total;

    Scanner keyboard = new Scanner(System.in);

    System.out.println("");
    price  = keyboard.nextDouble();

    salestax = price * 0.0825;
    total = price = salestax;

    System.out.print( "How much is the purchase price? " );
    price = keyboard.nextDouble();

    System.out.println( "Item price:\t" + price );
    System.out.println( "Sales tax:\t" + salestax );
    System.out.println( "Total cost:\t" + total );

  }
}
