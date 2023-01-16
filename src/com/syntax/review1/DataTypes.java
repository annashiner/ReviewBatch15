package com.syntax.review1;

public class DataTypes {
    public static void main(String[] args) {
        /*
        Data types in Java: 1. Primitive and 2. Non-primitive
        Primitive data types: byte, short, float, int, long, double, boolean, char
        numeric:
            whole numbers: byte, short, int, long
            decimal numbers: float, double
        boolean: true (yes) or false (no)
        char: single character
         */

        // dataType nameOfTheVariable = value;
        //datatypes for whole numbers
        byte num=10;
        short num1=10;
        int num2=1000; //most used
        long num3=1000000789678587L;

        //datetypes for decimal values
        float number=10.99f;
        double number2=100.89;

        //datatype to represent single character
        char money='$';
        char gender='m';

        //to represent yes or no
        boolean needBreak=true;
        boolean understandingJava=true;

        System.out.println(num1); //printing value inside variable num1=10
        System.out.println("num1"); //printing a String value=num1

        //create a variable and store value into it
        boolean hungry=false;
        System.out.println(hungry);
    }
}
