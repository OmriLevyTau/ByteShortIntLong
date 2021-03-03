package com.company;

public class Main {

    public static void main(String[] args) {

        int myValue = 1000;
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
//        System.out.println("Int Min = " + myMinIntValue);
//        System.out.println("Int Max = " + myMaxIntValue);

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
//        System.out.println("Byte Min = " + myMinByteValue);
//        System.out.println("Byte Max = " + myMaxByteValue);


        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
//        System.out.println("Short Min = " + myMinShortValue);
//        System.out.println("Short Max = " + myMaxShortValue);

        long myLongValue = 100L;
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
//        System.out.println("Long Min = " + myMinLongValue);
//        System.out.println("Long Max = " + myMaxLongValue);

        short bigShortLiteralValue = 32767;
        int myTotal = (myMinIntValue/2);
        byte myNewByteValue = (byte) (myMinByteValue/2);
        short myNewShortValue = (short) (myMinShortValue/2);

        byte byteValue = 10;
        short shortValue = 20;
        int intValue = 50;

        long longTotal = 50000L + 10L*(byteValue+shortValue + intValue);
//        System.out.println(longTotal);

        short shortTotal = (short) (1000+10*(byteValue+shortValue + intValue));

//        Another Data Types

        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
//        System.out.println("Float Min = " + myMinFloatValue);
//        System.out.println("Float Max = " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
//        System.out.println("Double Min = " + myMinDoubleValue);
//        System.out.println("Double Max = " + myMaxDoubleValue);

        int myIntValue = 5/2;
        float myFloatValue = 5f/3f;
        double myDoubleValue = 5d/3d;
//        System.out.println("MyIntValue = " + myIntValue);
//        System.out.println("myFloatValue = " + myFloatValue);
//        System.out.println("myDoubleValue = " + myDoubleValue);

        int myPounds = 200;
        double poundsTOKG = myPounds * 0.45359237;
//        System.out.println(poundsTOKG);


        char myChar = 'D';
        char myUni = '\u0044';
//        System.out.println(myChar);
//        System.out.println(myUni);

        boolean myTrue = true;
        boolean myFalse = false;

        //      Strings

        String myString = "This is a String";
//        System.out.println("my string = " + myString);
        myString = myString + " 99999";
//        System.out.println("new string = " + myString);

        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
//        System.out.println("lastString = " + lastString);

//        Operators

        int result = 1+2;
//        System.out.println(result);
        result++; // result = result + 1
//        System.out.println(result);
        result += 2;
//        System.out.println(result);

//        If-Then Statements
        boolean isAlien = false;
        if (isAlien == false) {
//            System.out.println("It is not an alien");
//            System.out.println("and Im scared");
        }

        int topScore = 80;
        int secondScore = 81;
        if ((topScore>secondScore) && (topScore<100)){
//            System.out.println("middle");
        }
        if ((topScore>90)||(secondScore<=90)){
//            System.out.println("beseder");
        }

        boolean isCar = false;
        if (isCar){ // == if isCar == true
//            System.out.println("is Car");
        }
        if (!isCar){ // !iscar == (isCar==false)
//            System.out.println("Not Car");
        }

//        Ternary Operator
//        a shortcut to assign one of two values to a variable on a given condition
//        it's a shortcut of the if-else
//

        boolean wasCar = isCar ? false : true;
        if (wasCar){
//            System.out.println("wasCar is False");
        }

        double valChalOne = 20.00d;
        double valChalTwo = 80.00d;
        double totalChal = (valChalOne + valChalTwo)*133.00d;
        double remainder = totalChal % 40.00;
        boolean isZero = (remainder == 0)? true:false;
        System.out.println(isZero);
        if (!isZero){
            System.out.printf("Got some remainder");
        }

    }
}
