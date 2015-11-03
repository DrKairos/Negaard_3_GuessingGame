/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negaard_3_guessinggame;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author DrKairos
 */
public class Negaard_3_GuessingGame {

    static int magicnumber;
    static int userguess;
    static String username;
    static Random randy = new Random();
    static boolean playagain;
    static int guessesleft=7;
    static int counter;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        Random rand = new Random();
        System.out.println("What is your name?");
        String name = sc.nextLine();
        System.out.println("Guess a number between 0-10,"+ name );
        int guess = sc.nextInt();
        int randomNum = rand.nextInt(11);
        if(guess == randomNum) {
            System.out.println("Correct, you win!");
        } else {
        System.out.println("Incorrect! You guessed "+guess+" and the number was "+randomNum+". Try again!");
        
        
    } 
    }
}
     
    







