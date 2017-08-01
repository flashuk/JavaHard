import java.util.Scanner

public class ShallowGrandmother{
public static void main(String[] args) {
    int age;
    Double income, cute;
    Boolean allowed;

    System.out.println("Whats is your age");
    age = keyboard.nextInt();

    System.out.println("What is your income");
    income = keyboard.nextDouble("");

    System.out.println("how cute are you?");
    cute = keyboard.nextDouble();
    allowed = ( age > 25 && age < 40 && ( income > 50000 || cute >= 8.5 ) );
    System.out.println( "Allowed to date my grandchild? " + allowed );


  }
}
