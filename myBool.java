import java.util.Scanner;

//password genarator
public class myBool{
  public static void main(String[] args) {
    Boolean a,b,c,d,e,f;
    Double g, h;
    Scanner keyboard = new Scanner(System.in);

    //user input first int
    System.out.println("Please enter your first number ");
      g = keyboard.nextDouble();
      //user input second int
      System.out.println("Please enter your second number");
      h = keyboard.nextDouble();

      a = g >= h;
      b = g <= h;
      c = g <  h;
      d = g >  h;
      e = g == h;
      f = g <- h;

      System.out.println("is " + g + " Greater then equals to " + h  + " "  + a );
      System.out.println("is " + g + " less then equals to " + h + " " + b );
      System.out.println("is " + g + " less then  " + h + " " + c );
      System.out.println("is " + g + " Greater then "+ h  + " "+ d );
      System.out.println("is " + g + " equals to " + h + " " + e );
      System.out.println("is " + g + " less then equals to "+ h + " " + f );


  }

}
