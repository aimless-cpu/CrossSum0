package com.company;

public class Main {

    public static void main(String[] args) {

        //Basic cross sum calculation.

        int number = 1234; //10

        String numberAsString = Integer.toString(number);
        char[] numbers = numberAsString.toCharArray();

        int sum = 0;

        for (int i=0;i< numbers.length;i++) {

            sum = sum +  Character.getNumericValue(numbers[i]);

        }

        System.out.println(sum);
        // write your code here
    }
}
