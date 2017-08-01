import java.util.Scanner;

public class AgeMessages {
public static void main(String[] args) {
int age;

Scanner keyboard = new Scanner(System.in);


 System.out.println("");
 age = keyboard.nextInt();

      if (age < 13 ) {
       System.out.println("");
      }
      if (age > 13 || age < 18)
      {
        System.out.println(" ");
      }
      if (age > 18 || age < 21 )
      {
        System.out.println("");
      }
      if (age > 21 || age < 35)
      {
        System.out.println("");
      }
      if (age > 65 || age == 65 )
      {
        System.out.println("retire");
      }
}
  }
