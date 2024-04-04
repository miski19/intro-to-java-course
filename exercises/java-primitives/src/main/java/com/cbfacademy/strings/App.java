package com.cbfacademy.strings;

public class App {
    public static void main( String[] args ) {
        System.out.println( "Hello World!" );
    }

    public static String concatenate(String word1, String word2, String word3) {
        // Write code that concatenates the input parameters and returns the result
        return word1.concat(word2.concat(word3))  ;
    }

    public static Boolean areEqual(String word1, String word2) {
        // Write code to determine whether the input parameters are equal strings
        return word1.equals(word2);

    
    }

    public static String format(String item, int quantity, double price) {
        //  Write code to return a string formatted as follows: "Item: [item]. Price: £[amount]. Quantity: [quantity]". The date should be formatted as DD/MM/YYYY, e.g. 24/10/2023
       return (String.format("Item: %1$s. Price: £%2$.2f. Quantity: %3$d", item, price, quantity));
    }
}
