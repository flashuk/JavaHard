import java.util.Scanner;

public class SecretWord {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    String secret = "Please", guess;
  

    System.out.println("Please enter your password");
    guess = keyboard.next();
    if (guess.equals(secret)){
      System.out.println("Thats is correct");
    }else{
      System.out.println("No, the password is incorrect ");
    }
    if (guess == secret)
    System.out.println("You have");

  }
}
