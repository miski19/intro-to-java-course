package com.cbfacademy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class FlowControlExercises {

    private static final Integer SumOfOdds = null;

    public List<String> fizzBuzz(List<Integer> numbers) {
        List<String> result = new ArrayList<>(); //  - Implement this method such that
        for (int i = 0; i < numbers.size(); i++) {
          
          Integer number = numbers.get(i);

         if (number % 3 == 0 && number % 5 == 0) {
            result.add("FizzBuzz");
         } else if (number % 3 == 0) {
            result.add("Fizz");
          } else if (number % 5 == 0) {
            result.add("Buzz");
          } else {
            result.add(number.toString());
          }
        }
        return result; 
      } //  it creates a list where for each element of the input list ${numbers}
         //  - if the ${element} is divisible by 3, it adds “Fizz” to the list
        //  - if the ${element} is divisible by 5, it adds “Buzz” to the list
        //  - if the ${element} is divisible by both 3 and 5, it adds “FizzBuzz” to the list
        //  - it adds the element to the list in any other case
        //  - it returns the constructed list
        


    public String whichMonth(Integer number) {
       String[] months= {"January", "February", "March", "April", "May", "June", 
       "July", "August", "September", "October", "November", "December"};
       if (number >= 1 && number <= 12) {
        return months[number - 1];
       } else {
        return "Invalid month number";
       }
      //  Implement this method such that 
       
        //  - it returns the month corresponding to the input ${number}
        //  - if the ${number} is invalid, the method should return "Invalid month number"
        
      }

    public Map<String, Integer> sumOfOddsAndSumOfEvens() {
        //  - it creates and initialises a list of 100 numbers - from 1 to 100
       IntStream numbers = IntStream.range(1, 101);
       
        
        //  - determines the sum of all the even numbers in the list
        int sumOfEvens = numbers.filter(i -> i % 2 == 0).sum();
        //  - determines the sum of all the odd numbers in the list
         numbers = IntStream.range(1, 101);
        int sumOfOdds = numbers.filter(i -> i % 2 != 0).sum();
        //  - returns a map with two entries:
        //      {"SumOfEvens", calculatedSumOfEvens}, {"SumOfOdds", calculatedSumOfOdds}
        HashMap<String, Integer> map = new HashMap<>();
        map.put("SumOfEvens", sumOfEvens);
        map.put("SumOfOdds", sumOfOdds);
        return map ;
    }

    public List<Integer> reverse(ArrayList<Integer> numbers) {
        // - Implement this method such that
        //  - it takes an array list of integers
        //  - it returns the list in reverse order
        Collections.reverse(numbers);
        return numbers;
    }

    public String getName() {
        return "Flow Control Exercises";
    }
}
