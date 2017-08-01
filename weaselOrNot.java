import java.util.Scanner;

public class weaselOrNot {
public static void main(String[] args) {
  Scanner keyboard = new Scanner(System.in);
    Boolean yep,nope;
    String word;
    System.out.println("Type the word \"Weasel\", please");
    word = keyboard.next();

     yep = word.equals("Weasel");
     nope  = ! word.equals("Weasel");

    System.out.println("you typed what was asked " + yep);
    System.out.println("you ignored simple instrution " + nope);



  }
}
