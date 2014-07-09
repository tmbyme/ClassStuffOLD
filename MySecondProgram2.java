import java.util.Scanner;
public class MySecondProgram2
{

//
   public static void main (String [] args)
   {
      Scanner scan = new Scanner (System.in);
      
         System.out.println("Hello, what's your name?");   
         String name = scan.nextLine (); //for 2 name such as Mary Alice
         System.out.println ("Welcome " + name + " How are You?");
         System.out.println ("How many glasses of wine would you like?");
         int numGlasses = scan.nextInt ();
         
         while (numGlasses < 0) //indef loop (This is a loop)
            { 
               System.out.println ("Oops, try again.");
               System.out.println ("How many glasses of wine would you like?");
               numGlasses = scan.nextInt ();
            }
                   
            if (numGlasses ==1)
               System.out.println ("Let me serve you " + numGlasses + " glass of wine");
               
            else if (numGlasses >1)
               System.out.println ("Let me serve you " + numGlasses + " glasses of wine");
                                      
            if (numGlasses > 2)
         { 
                System.out.println ("Cheers!");
                System.out.println ("Call a cab"); 
                getSnack ();
         }   
           
            else if (numGlasses ==2)
         {
                System.out.print ("Relaxing with friends");
         }
            else if (numGlasses ==1)
         {
                System.out.println ("Have another!");
         } 
            else if (numGlasses ==0)
         {     
                getSnack ();
                System.out.println ( "Can I get you a soda? y/n" );
                String sodaChoice = scan.next ();
                if (sodaChoice.equals("y")) //.equals compare because its a word response
                 System.out.println ( "Great Ill be right back" );
                else
                 System.out.println ( "Aren't you thirsty" );
         }       
            //Dont need this any more
            else 
                System.out.println ("No negative allows");//This is the statement
   }   
   
   public static void getSnack()//Method - I created this method
   {
      System.out.println (" Cheese, Fruit and crackers are in the fridge");
   
   }
         
         
}