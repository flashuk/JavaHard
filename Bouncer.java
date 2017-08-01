import java.util.Scanner;

public class Bouncer{
public static void main(String[] args) {

      int age;   //set age to int
      boolean guestList; //bool to check if on list
      double pretty;
      String gender = "F"; //

      Scanner keyboard = new Scanner(System.in);
      System.out.println("please enter your age");
      age = keyboard.nextInt();
      System.out.println("are you on guest list, true or false");
      guestList = keyboard.nextBoolean();
      System.out.println(" your allure rating");
      pretty = keyboard.nextDouble();
      System.out.println("Are you male or female \n M for mafe, \n F for female");
      gender = keyboard.next();

        if (age >= 21 && guestList == true && (gender.equals("F") && pretty >= 7.5))
        {
        System.out.println("you are allowed into club ");

        }
  }
}
