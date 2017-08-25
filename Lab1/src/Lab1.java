/**
 *   Name:      Brad Crockett
 *
 *   Course:    CSCI 13, Fall 2017
 *
 *   Date:      8/18/17
 *
 *   Filename:  Lab1.java
 *
 *   Purpose:   Greet the user and ask for their name. Then respond
 *              to them by name.
 *
 */

import java.util.Scanner;

public class Lab1{

    public static void main(String[] args) {

        //Data: variable declarations/initalizations
        //Create a scanner object and a String var to hold the username
        Scanner scan = new Scanner(System.in);
        String userName = "";

        //constant definitions and user input prompts


        //Computations and algorithms


        //Outputs, formatting and display
        //Print Hello world then ask for the user's name then print Hello (user)
        System.out.println("Hello world.\nWhat is your name?");
        userName = scan.nextLine();
        System.out.printf("Hello %s nice to meet you.\n", userName);

    }//end main method
}//end class