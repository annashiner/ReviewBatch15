package com.syntax.review1;

import java.sql.SQLOutput;

public class WorkingWithVariables {
    public static void main(String[] args) {

        // create a variable and store value into it
        // declared a variable and initialized it
        int number=10;

        //declared a variable
        int num; //declaration of a variable happens only once
        num=100; //initialize the variable
        num=200; //reassign the value
        //num=30.01; error

        System.out.println(num); //200

        boolean hungry=false;
        hungry=true;
        //hungry="yes"; error

        String myString="Hello";
        String name="Anna";
        String address="123 Test Drive";

        //Hello Anna
        System.out.println(myString+" "+ name);

        int age=24;

        //Anna is 24 years old

        System.out.println(name+" is "+age+" years "+" old");
        /*
        if we want to attach String to anything:

            String to another String
            String to int
            String to boolean
            String to char

            we use + -> acts as concatenation
         */

        //when we have 2 numeric values + acts as addition
        System.out.println(number+num);

        String n1="10";
        System.out.println(n1+num);

        String month="December";
        int day=14;

        //14 December
        System.out.println(day+" "+month);

        char date='1';
        System.out.println(date+" "+ month);

        System.out.println(date+day);
        //+ attaches 2 values together as long as one value is a String value
    }
}
