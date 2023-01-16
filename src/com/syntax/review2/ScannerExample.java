package com.syntax.review2;
import com.sun.tools.attach.AgentInitializationException;

import java.util.Scanner; //must import for Scanner to work
public class ScannerExample {
    public static void main(String[] args) {

        int num=10; //storing value 10 inside variable i inside datatype int
        // read right to left
        num=11;

        Scanner keyboard = new Scanner(System.in); //scanner is a non primitive datatype

        System.out.println("Please enter your age");
        int age=keyboard.nextInt(); //to capture int values

        System.out.println("Are you tired");
        boolean tired = keyboard.nextBoolean();    //to capture boolean values

        System.out.println("What is your name");
        String name=keyboard.next();       //to capture String until space

        System.out.println(age);
        System.out.println(tired);
        System.out.println(name);
    }
}
