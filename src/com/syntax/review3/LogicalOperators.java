package com.syntax.review3;

public class LogicalOperators {
    public static void main(String[] args) {

        boolean cold = true;
        boolean rain = true;

        /* AND
        true && true -> true
        true && false-> false
        false && true -> false
        false && false -> false
         */

        if (cold && rain) { //true
            System.out.println("I will stay at home");
        }

        /* OR
        true || true -> true
        true || false -> true
        false || true -> true
        false || false -> false
         */

        if (cold || rain) { //true
            System.out.println("I will stay at home");
        }

        boolean loginButtonDisplayed = true;
        boolean loginButtonClickable = false;
        if (loginButtonDisplayed && loginButtonClickable) {
            System.out.println("Test case is passed");
        } else {
            System.out.println("Test case is failed");
        }

        System.out.println("---------------LOGICAL OR---------------------");

        boolean dashboard = true;
        String message = "Welcome Admin";
        if (dashboard || message.equals("Welcome Admin")) {
            System.out.println("User is logged in");
        }else{
            System.out.println("User is not logged in");
        }

        System.out.println("---------------LOGICAL NOT--------------------");

        boolean agreeCheckboxSelected=true;
        if(!agreeCheckboxSelected){
            System.out.println("I am clicking on checkbox");
        }
        System.out.println("I am clicking on submit button");


    }
}
