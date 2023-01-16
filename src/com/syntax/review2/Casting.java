package com.syntax.review2;

public class Casting {
    public static void main(String[] args) {
        /*
        casting- converting 1 datatype into another
        2 types
            1. Widening/implicit/automatic
            (byte->short->int->long->float->double)
            Starting with the smallest data type and getting bigger
            2. Narrowing/explicit/manual
            (double->float->long->int->short->byte)
           Starting with the biggest data type and getting smaller
         */

        double d=5; //int->double
        System.out.println(d); //5.0 is the output
        //Widening- happens automatically
        //Store something small into a bigger box

        // int i=5.0; will not work
        int i=(int)5.0;
        //Narrowing- have to do manually

        byte b=(byte)128;
        System.out.println(b);
    }
}
