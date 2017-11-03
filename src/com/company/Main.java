

package com.company;
import java.lang.Character;
import java.lang.reflect.Array;
import java.util.Arrays;


public class Main {

    public static void main(String[] args) {

//        // Some of my tests
//        char [] emptyCharArray = {};
//        char [] oneElementArray = {'a'};
//        char [] charArrayEndingWithCapital = {'a', 'K', 'c', 'D', 'E'};
//        char [] myCharArray = {'a', 'K', 'c', 'D', 'E', 'l'};
//
//        /*unhandled (untested tests) tests for now
//         * Array containing numbers
//         * Array with all Lower Case
//         * Array with all Upper
//          * */
//
//
//        lowerUpperCase(myCharArray);

        int [] leNums = twoSum(new int[]{3,3}, 6);
        System.out.println(Arrays.toString(leNums));

    }



    public static char [] lowerUpperCase(char [] input){

        /* i use i to loop through the whole array
        * j is used to look ahead
        * */

        //empty array or 1 element array check
        if(input.length <= 1)
            return input;





        for(int i = 0; i < input.length; i++){

            if(Character.isUpperCase(input[i])) {
                for(int j = i; j < input.length; j++) {

                    if(j == input.length - 1){
                        if(Character.isLowerCase(input[j])) //handles last element being a lower case
                            j = 0;
                        else
                            return input;
                    }

                    if(Character.isLowerCase(input[j])) {

                        swap(input, i, j);

                        break;
                    }
                }
            }

        }

        return input;
    }

    // method to swap elements in the array
    private static void swap(char[] input, int i, int j){
        char temp = input[i];
        input[i] = input[j];
        input[j] = temp;

    }


    // Add two numbers in an array
    public static int[] twoSum(int[] nums, int target) {
        int sum = 0;
        int [] leNums = null;
        for (int i = 0; i<nums.length; i++){
            for(int j =1; j<nums.length; j++){

                if(nums[i] == nums[j]) {
                    j = j+1;
                    if(j > nums.length){
                        break;
                    }

                }

                sum = nums[i] + nums [j];
                if (sum == target) {
                    return  new int[]{i, j};

                }
            }

            sum = 0;
        }

        return null;

    }
}
