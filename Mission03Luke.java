//Import relevant Java tools for use in program
import java.util.Scanner;
import java.util.Random;

//Main body of code starts here
public class Mission03Luke
{
   public static void main (String[] args)
   {
   //Initialize variables to be used in program
   int randomNum = 0;
   int guessCount = 0;
   int guess = 0;
   
   //Ready a variable/ instance for Scanner and Random tools
   Scanner in = new Scanner (System.in);
   Random r = new Random();
   
   //Generate random number and load into variable
   randomNum = r.nextInt(100) + 1;
   
   //Collect input from user
   System.out.println("Welcome to the Higher / Lower Game! Try to guess the number between 1 and 100.");
   System.out.println("Enter your guess: ");
   guess = in.nextInt();
   
   //Intiate Do/ While loop to test if the user guessed correctly
   do
      { 
         //first check to see if the guess is valid
         if (guess < 1 || guess > 100)
         {
            System.out.println("Sorry, the guess needs to be a number between 1 and 100. Please try again: ");
            guess = in.nextInt();
         }
         
         //Then check to see whether the guess is lower/ higher than the correct number, include appropriate response, increment count variable, and gather new input.
         else if (guess > randomNum)
         {
            System.out.println("The correct number is lower.");
            System.out.println("Enter your guess: ");
            guess = in.nextInt();
            guessCount ++ ;
         }
         
         else if (guess < randomNum)
         {
            System.out.println("The correct number is higher.");
            System.out.println("Enter your guess: ");
            guess = in.nextInt();
            guessCount ++ ;
         }
     
      } while (guess != randomNum);
      guessCount ++;
   //Exit loop and output final results for user (Correct number & # of guesses)
   
   if (guessCount == 1)
      {
         System.out.println("The number was " + randomNum + "! You guessed correctly! Wow, you got it on your first try! Congratulations!");
      }
   
   else
      {
         System.out.println ("The number was " + randomNum + "! You guessed correctly! It took you " + guessCount + " tries.");
      }

   }

}