package com.syntax.review2;

public class IfElseIf {
    public static void main(String[] args) {

        /*
        when we have more conditions to test, use if else if

        if (boolean condition) {
            code A;
        } else if (boolean condition) {
            code B;
        } else if (boolean condition) {
            code C;
        }

         */

        /*
        Check homework
        if you completed more than >25 assignments -> great job
        if you completed more than >20 -> good job
        if you completed more than >10 -> okay job
        if you completed more than >5 -> not good job
         */

        int homework=30;
        if (homework>25){
            System.out.println("Great Job!!");
        } else if (homework>20){
            System.out.println("Good job");
        } else if (homework>10){
            System.out.println("Okay job");
        } else if (homework>5){
            System.out.println("Not good job");
        }
        // out of all statements, only the true statement will be printed

        System.out.println("---------------------------------------");

        String browser="opera";
        if (browser.equals("chrome")) {
            System.out.println("Test cases executed on chrome browser");
        } else if (browser.equals("safari")) {
            System.out.println("Test cases executed on safari browser");
        } else if (browser.equals("firefox")) {
            System.out.println("Test cases executed on firefox browser");
        } else {
            System.out.println("Browser is not supported"); //if no conditions are true, java comes to the else block
        }
    }
}
