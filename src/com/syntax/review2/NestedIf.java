package com.syntax.review2;

public class NestedIf {
    public static void main(String[] args) {
        /*
        nested if is 1 is statement inside another if statement
        when we have 1 condition that depends on another
         */

        boolean vaccine=false;
        int dose=2;
        if (vaccine) { //outer if
            System.out.println("How many doses do you have?");
            if (dose == 1) { //inner if
                System.out.println("You need a second shot");
            } else {
                System.out.println("You are fully vaccinated");
            }
        } else {
            System.out.println("I do not have a vaccine");
        }
    }
}
