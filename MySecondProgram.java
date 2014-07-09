import java.util.Scanner;
public class MySecondProgram
{
   public static void main (String [] args)
   {
      Scanner scan = new Scanner (System.in);
      
         System.out.println("Hello, what's your name?");   
         String name = scan.next ();
         System.out.println ("Welcome " + name + " How are You?");
         System.out.println ("How many glasses of wine would you like?");
         int numGlasses = scan.nextInt ();
         System.out.println ("Let me serve you " + numGlasses + " glasses");
            
            if (numGlasses > 2)
         { 
                System.out.println ("Cheers!");
                System.out.println ("Its Hot in here!");
         }   
            else if (numGlasses ==1)
         {
                System.out.print ("Your glass needs a friend!");
         }
            else
         {
                System.out.println ("Get more glasses!");
         } 
   }         
         
}