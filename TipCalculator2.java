import java.util.Scanner;

public class TipCalculator2
{
   public static void main (String []args)
   {
      Scanner scan = new Scanner (System.in);
      System.out.print ("Good Evening. What is your Name? ");
      String name = scan.next ();
      System.out.println ("Hello, " + name + "!");
      System.out.print ("Bill amount --> ");
      double amount = scan.nextDouble ();
      System.out.print ("Enter tip percentage --> ");
      int percentage = scan.nextInt ();
      double tip = amount * (percentage/100.0);
      double total = amount + tip;
      System.out.println ("You should pay: " + "$" + total);
   }   
}