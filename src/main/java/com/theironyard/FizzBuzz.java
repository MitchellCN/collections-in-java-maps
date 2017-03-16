package com.theironyard;

import java.util.ArrayList;
import java.util.HashMap;
//hashmaps contain a set of "keys" which are indexes that point to arrays.
//Hashmaps holds a collection of objects indexe by other objects. hashmap does not guarantee the order the elements and indexes them by any other type of object often String S
    //ArrayLists store objects in a orderde list and indexes them using integers
//Syntax for HashMap: HashMap<<data type>, <data type>> <variable name> = new HashMap<>()
/**
 * For this exercise you will be making a class with one static method that is a
 * variation on the classic FizzBuzz exercises. Follow the instructions below.
 */
public class FizzBuzz {

    /**
     * Create a static method named asMap(). This method implements a variation
     * on the classic FizzBuzz exercise. The method should accept an int
     * argument named `max`. The method will iterate from 1 to max (inclusive)
     * and create a HashMap that is keyed by Strings and contains values that
     * are Array List of Integers.
     * <p>
     * The HashMap returned will have three keys:
     * <p>
     * fizz - This is an Array of integers in the range 1 to `max` inclusive
     * that are divisible by 3 (but not 5). EG: 3, 6, 9, etc.
     * <p>
     * buzz - This is an Array of integers in the range 1 to `max` inclusive
     * that are divisible by 5 (but not 3). EG: 5, 10, 20, etc.
     * <p>
     * fizzbuzz - This is an Array of integers in the range 1 to `max` inclusive
     * that are divisible by both 3 and 5. EG: 15, 30, 45, etc.
     * <p>
     * All other numbers are disregarded.
     * <p>
     * So, if the `max` argument provided is 45, this method will return a
     * HashMap that looks like this:
     * <p>
     * {
     * fizz -> [3, 6, 9, 12, 18, 21, 24, 27, 33, 36, 39, 42],
     * buzz -> [5, 10, 20, 25, 35, 40],
     * fizzbuzz -> [15, 30, 45]
     * }
     *
     * @param max The maximum number to iterate to when generating the HashMap
     * @return A HashMap of Strings mapped to an Array of Integers containing keys and values for fizz, buzz, and fizzbuzz
     */
//create the method for Hashmap with ArrayList inside the hashmap and defining the method as asMap and argument int max
    public static HashMap<String, ArrayList<Integer>> asMap(int max) {

//renaming hashmap as hmap
        HashMap<String, ArrayList<Integer>> hmap = new HashMap<>();
//setting up fizz, buzz, and fizzbuz within the new arraylist
        ArrayList<Integer> fizzbuzzArray = new ArrayList<>();
        ArrayList<Integer> fizzArray = new ArrayList<>();
        ArrayList<Integer> buzzArray = new ArrayList<>();

// initially i went straight into creating the key/value for hashmap without knowing the value

        //hmap.put("fizz", fizzArray);
       // hmap.put("buzz", buzzArray);
        //hmap.put("fizzbuzz",fizzbuzzArray);

//creating the for loop.
        for (int i = 1; i <= max; i++) {

//creating the if statement within the loop. Fizzbuzz remainder of 3 and 5 put in fizzbuzz,
            if ((i % 3) == 0 && (i % 5) == 0) {
                fizzbuzzArray.add(i);
                //remainder of ust 5 buzz.
            } else if ((i % 5) == 0) {
                buzzArray.add(i);

        //remainder of just 3 Fizz,
            } else if ((i % 3) == 0) {
                fizzArray.add(i);
            }
        }
//adding fizz, buzz, fizzbuzz by using the put feature of hashtags
        //
            hmap.put("fizz", fizzArray);
            hmap.put("buzz", buzzArray);
            hmap.put("fizzbuzz",fizzbuzzArray);

//returning values of hmap
      return hmap;
    }
}