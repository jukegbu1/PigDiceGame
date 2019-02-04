//Create a program that:
//•	Randomly select two numbers from 1-6 (like rolling two dice)
//•	Show dice rolls
//•	Show running score
//•	Prompt user to roll again or lose turn
//•	A player scores the sum of the two dice thrown and gradually reaches a higher score as they continue to roll
//•	If a single number 1 is thrown on either die, the score for that whole turn is lost
//•	However a double 1 counts as 25
//•	When you reach a score of 100 (or more) game ends

//package com.company;
import java.security.Key;
import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Scanner Keyboard = new Scanner(System.in);

        //Welcome user to play Game
        System.out.println("Welcome let's play dice game!");

        int keepscore = 0;
        int Dice1;
        int Dice2;
        int RollDice;
        int score = 0;
        String answer;
        int sum;

//        //*{
//            Random r = new Random();
//            Dice1 = (int) (Math.random() * 6) + 1;
//            Dice2 = (int) (Math.random() * 6) + 1;
//            score = Dice1;
//            score = Dice2;
//            System.out.println("You rolled" + "Dice1" + "Dice2");
//        }

        do {

//                Random r = new Random();
            Dice1 = (int) (Math.random() * 6) + 1;
            Dice2 = (int) (Math.random() * 6) + 1;
//                score = Dice1;
//                score = Dice2;
            System.out.println("You rolled " + Dice1 + " , " + Dice2);

        //If Dice 1 or dice 2 roll 1
        if (Dice1 == 1 || Dice2 == 1) {
            keepscore = (keepscore + 0);
            System.out.println("Your score is " + keepscore);

            //If Dice 1 & Dice 2 roll 1
        } else if (Dice1 == 1 && Dice2 == 1) {
            keepscore = (keepscore + 25);
            System.out.println("That is a double! Your score is" + keepscore);
        }

        //If Dice 1 & Dice 2 roll other than 1s
        else if (Dice1 > 1 && Dice2 > 1) {
            score = Dice1 + Dice2;
            keepscore = (keepscore + score);
            System.out.println("Your score is " + keepscore);
        }
//            //If score over 100 points
//            if (score >= 100) {
//                System.out.println("Thanks for playing!");
            System.out.println("Try again? Please enter Yes or No");
            answer=Keyboard.next();


       }while(keepscore < 100 && answer.equalsIgnoreCase("Yes"));

     System.out.println("Thanks for playing!");


    }
}