/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question3;

import java.util.Scanner;

/**
 * This a program generates a random number between 0 and 100 and asks the user to guess it. The
   user can have at maximum 10 trials. If the number is guessed, the user should be asked if she/he wants
   to play again. If the number is not guessed and 10 trials were used, the user is not lucky, the program
   terminates.
 * @author Constantinos
 */
public class Question3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 
        Scanner sc = new Scanner(System.in);
        
        String answer;
        int counter = 0;
        int number = (int)(Math.random()*100);
        boolean repeat = true;
        System.out.println("Enter a number between 0 and 100 in order to start playing: ");
        int guess = sc.nextInt();
        
        
        while (repeat) {
            counter ++;
            
            if (number != guess && counter != 10) {
                System.out.println("Try again! ");
                guess = sc.nextInt();
            } else if (number == guess && counter == 10) {
                System.out.println("Congrats, you guessed correctly! ");
                repeat = false;
                System.out.println("Do you wish to play again? (YES or NO) ");
                answer = sc.next();
                
            } else if (number == guess && counter != 10) {
                System.out.println("Congrats, you guessed correctly! ");
                repeat = false;
            } else if (number != guess && counter == 10) {
                System.out.println("You are unlucky... ");
                repeat = false;
            }
        }
        
    }
    
}
