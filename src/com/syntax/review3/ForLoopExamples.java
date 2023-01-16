package com.syntax.review3;

public class ForLoopExamples {
    public static void main(String[] args) {

        for (int i=10; i>5; i--){
            System.out.println(i);
        }

        for (int i=5; i<=1; i--){
            System.out.println("Happy");
        }

        for (int i=1; i<=6; i++){
            if(i%2==0){//number can be divided by 2 with no remainder
                System.out.println(" even number "+i); //will only print even numbers
            }
        }
    }
}
