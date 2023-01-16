package com.syntax.review3;

public class ForLoop {
    public static void main(String[] args) {

        /*
        1. Initialization
        2. Condition
        3. If true -> code goes inside the loop body
        4, Goes back, increment
        5. Repeat
         */
        for(int i=1; i<=5; i++){
            System.out.println("Hello "+i); //when a condition is checked, Java enter a block of code
        }

        for (int a=0; a<8; a+=4){
            System.out.println("Bye");
        }

        for (int i=2; i>10; i++){
            System.out.println(i);
        }
        System.out.println("End");

        /* will never end

        for (int j=3; j<10; j--){
            System.out.println(j);
        }
         */
    }
}
