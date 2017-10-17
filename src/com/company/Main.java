package com.company;

public class Main {

    public static void main(String[] args) {
        int [] myArray = {1,4,4,5};
        maxValueInArray(myArray);
    }

    public static String reverse(String s){
        int length = s.length();



        char [] sCharaters = s.toCharArray();
        char [] sReversedCharacters = new char[length];

        for (int i = 0; i < length; i++){
            sReversedCharacters[length-i-1] = sCharaters[i];

        }
        System.out.println(String.valueOf(sReversedCharacters));
        return String.valueOf(sReversedCharacters);
    }

    public static void multiplicationTable(int max){
        for(int i = 1; i <= max; i++){
            for(int j = 1; j <= max; j++){
                System.out.print(" "+ String.format("%d", j*i));
            }
            System.out.println();

        }
    }

    public static int maxValueInArray(int [] inputArray){
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < inputArray.length; i++){
            if(inputArray[i] > max){
                max = inputArray[i];
            }
        }
        System.out.print(max);
        return max;
    }
}
