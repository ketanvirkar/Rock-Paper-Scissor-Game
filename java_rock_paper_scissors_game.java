package com.smv;
import java.util.Random;
import java.util.Scanner;
//import java.util.*;
public class java_rock_paper_scissors_game {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        String userschoice;
        String computerschoice;
        System.out.print("Enter Users choice: ");
        int num1 = sc.nextInt();
        System.out.print("Enter Computers Choice: ");
        int num2 = random.nextInt(3);
        System.out.println(num2);

        if(num1==0)
        {
            userschoice = "Rock";
            System.out.println("Your choice is Rock");

        }
        else if (num1==1)
        {
            userschoice = "Paper";
            System.out.println("Your choice is Paper");

        }
        else if (num1==2)
        {
            userschoice = "Scissors";
            System.out.println("Your choice is Scissors");

        }
        else
        {
            System.out.println("Invalid Choice!");
        }
        if(num2==0)
        {
            computerschoice  = "Rock";
            System.out.println("Computers choice is Rock");
        }
        else if(num2==1)
        {
            computerschoice = "Paper";
            System.out.println("Computers choice is Paper");
        }
        else if(num2==2)
        {
            computerschoice = "Scissors";
            System.out.println("computers choice is Scissors");
        }
        else
        {
            System.out.println("Invalid Choice!");
        }

        if(num1==num2)
        {
            System.out.println("You both choose same choice, Game Tied !!");
        }
        else if(num1==0 && num2==1)
        {
            System.out.println("Computer won!!");
        }
        else if(num1==0 && num2==2)
        {
            System.out.println("You won!!");
        }
        else if(num1==1 && num2==0)
        {
            System.out.println("You won!!");
        }
        else if(num1==1 && num2==2)
        {
            System.out.println("Computer won!!");
        }
        else if(num1==2 && num2==0)
        {
            System.out.println("Computer won!!");
        }
        else if(num1==2 && num2==1)
        {
            System.out.println("You won!!");
        }

    }
}
