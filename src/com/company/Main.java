package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        int[] numbers = new int[]{-1,-2,-3,-5,-8,5,3,0};
        System.out.println(getleast(numbers) );  // question 1

        System.out.println(fibonacciSeries(15) ); // question 3
        printPrimeNumbers(); // question 4
    }

    /**
     * @implNote
     *   The algorithm for the smallest positive integer
     * (greater than 0) that does not occur in a given array is:
     *  - sort the given array
     *  - loop through the array, if the current element is less that 1:
     *          - continue
     *          else
     *          - if the value of the current element plus 1 is less the the value of the next element
     *          return the n+1 value
     *
     *          -- this is because each consecutive integer of N as a value greater than +1 than the previous
     * @param numbers
     * @return
     */
    public static int getleast(int[] numbers){
        Arrays.sort(numbers);
        for(int counter = 0; counter< numbers.length; counter++){

            if(numbers[counter] < 1){ continue; }

            if(numbers[counter] + 1 < numbers[counter+1]){
               return numbers[counter] + 1;
            }
        }
        return 1;
    }

    /**
     * Write a JAVA program to generate Fibonacci series
     */

    public static ArrayList<Integer> fibonacciSeries(int range){
        ArrayList<Integer>fibonacci = new ArrayList<>();
        int prev = 0;
        int current = 1;

        for(int count = 0; count < range; count++){
            if(count < 2){
                fibonacci.add(1);
                continue;
            }
          fibonacci.add( prev + current);
          prev = current;
          current =  fibonacci.get(count);
        }
        return fibonacci;
    }

    public static void  printPrimeNumbers(){
        /**
         *  create an arraylist and fill it with 100 elements from 1 to 100
         */
        ArrayList<Integer> primeList = new ArrayList<>();
        for (int count = 100; count >= 2; count--){
                primeList.add(count);
        }

        /**
         *  Loop through the List and remove any multiples for i
         */
        for (int counter = 2; counter <= primeList.size(); counter++) {
            for (int arrayElement = 0; arrayElement < primeList.size(); arrayElement++){
                if(primeList.get(arrayElement) % counter ==0 && primeList.get(arrayElement) != counter){
                    primeList.remove(arrayElement);
                }
            }
        }
        System.out.println(primeList);
    }
}
