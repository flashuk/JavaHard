import java.util.Scanner;

public class rudeQuestions{
    public static void main(String[] args) {
        String name;
        int age;
        double weight, income,year;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Hello, What is your name");
        name = keyboard.next();

        System.out.println("What is your passcode " + name);
        age = keyboard.nextInt();

        System.out.println("How much do you weight " + name);
        weight = keyboard.nextDouble();

        System.out.println("Whats your monthly income ");
        income = keyboard.nextDouble();
        year = income * 12;
        System.out.println("Thanks for answering question " + name);
        System.out.println("Your names is " + name + "you are " + age);
        System.out.println("You earn " + year +  " Not bad");

    }

}
