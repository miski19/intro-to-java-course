package com.cbfacademy;

import java.util.*;

public class CollectionsExercises {

    public LinkedList<Integer> useLinkedList() {
       LinkedList<Integer> integers = new LinkedList<>(); //  create an empty linked list

        integers.add(4); //  - add 4 as the first element of the list
        integers.add(5);
        integers.add(6);
        integers.add(7);
        integers.add(8);
        integers.add(9);
        integers.add(2);
        integers.add(3,4);

        System.out.print(integers.element());
        //  - then add 5, 6, 8, 2, 9 to the list
        //  - add another 2 as the last element of the list
        //  - add 4 as the 3rd element of the list
        //  - invoke the method element() on the list and print the result on the screen
        //  - return the list

        return integers;
    }

    public Stack<Integer> useStack() {
       Stack<Integer> stack = new Stack<>(); //  create an empty stack

        stack.add(5);
        stack.add(6);
        stack.add(8);
        stack.add(9);//  - add 5, 6, 8, 9 to the stack

        System.out.print(stack.firstElement());//  - print the first element of the stack on the screen
        System.out.print(stack.lastElement());//  - print the last element of the stack on the screen
        System.out.print(stack.pop());//  - invoke the method pop() on the stack and print the result on the screen
       stack.push(4); //  - invoke the push(4) method on the stack

        return stack;
        
    }

    public ArrayDeque<Integer> useArrayDeque() {
       ArrayDeque<Integer> queue = new ArrayDeque<>(); // create an empty arrayDeque
       
        queue.add(5);
        queue.add(6);
        queue.add(8);
        queue.add(9);//  - add 5, 6, 8, 9 to the queue

        System.out.print(queue.getFirst());//  - print the first element of the queue on the screen
        System.out.print(queue.getLast());//  - print the last element of the queue on the screen
        System.out.print(queue.poll());//  - invoke the method poll() on the queue and print the result on the screen
        System.out.print(queue.element());//  - invoke the element() method on the queue and print the result on the screen

        return queue;//  - return the queue

    }

    public HashMap<Integer, String> useHashMap() {
       HashMap<Integer, String> languages = new HashMap<>(); // : create an empty hash map

       languages.put(1, "TypeScript"); //  - add {1, TypeScript} entry to the map
       languages.put(2, "Kotlin"); //  - add {2, Kotlin} entry to the map
       languages.put(3, "Pyton");//  - add {3, Python} entry to the map
       languages.put(4, "Java"); //  - add {4, Java} entry to the map
       languages.put(5, "JavaScript");//  - add {5, JavaScript} entry to the map
       languages.put(6, "Rust");//  - add {6, Rust} entry to the map

       System.out.print(languages.keySet());//  - determine the set of keys from the map and print it on the screen
       System.out.print(languages.values()); //  - determine the set of values from the map and print it on the screen
       System.out.print(languages.containsKey("English")); //  - determine whether the map contains "English" as a language and print the result on the screen

       return languages; //  - return the map
       
    }

    public String getName() {
        return "Collections Exercises";
    
}
