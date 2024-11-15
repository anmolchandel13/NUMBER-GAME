// Source code is decompiled from a .class file using FernFlower decompiler.
import java.util.Random;
import java.util.Scanner;

public class NumberGame {
   public NumberGame() {
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      Random var2 = new Random();
      int var3 = 0;

      for(boolean var4 = true; var4; var4 = var1.next().equalsIgnoreCase("yes")) {
         int var5 = var2.nextInt(100) + 1;
         int var6 = 0;
         byte var7 = 10;
         boolean var8 = false;
         System.out.println("Guess a number between 1 and 100 (You have " + var7 + " attempts):");

         while(var6 < var7 && !var8) {
            System.out.print("Enter your guess: ");
            int var9 = var1.nextInt();
            ++var6;
            if (var9 == var5) {
               System.out.println("Correct! You guessed the number in " + var6 + " attempts.");
               var3 += 10 - var6;
               var8 = true;
            } else if (var9 > var5) {
               System.out.println("Too high! Try again.");
            } else {
               System.out.println("Too low! Try again.");
            }
         }

         if (!var8) {
            System.out.println("Out of attempts! The correct number was " + var5 + ".");
         }

         System.out.println("Your score: " + var3);
         System.out.print("Do you want to play again? (yes/no): ");
      }

      System.out.println("Thanks for playing! Final score: " + var3);
      var1.close();
   }
}
