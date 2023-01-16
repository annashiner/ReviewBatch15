package com.syntax.review2;

public class IfStatement {
    public static void main(String[] args) {

        /*
        if statement- conditional statement
        if(boolean condition) {block of code}
         */
        // >, >=, <, <=, !=, ==

        int day=1;
        if (day==1) {
            System.out.println("It is the first day of the month");
        }
        if (day==2) {
            System.out.println("It is the first day of the month");
            //will not work because it is not true
        }

        String month="December";
        //do not use relational operators because it is a different datatype
        //instead of ==, use .equals because it is not an arithmetic datatype
        if (month.equals("December")) {
            System.out.println("It is Christmas time");
        }

        boolean evening=true; //true=yes
        if (evening) {
            System.out.println("I might have a class at Syntax");
        }
        // if your condition is already a boolean value, you do not need to use == Ll
    }
}
