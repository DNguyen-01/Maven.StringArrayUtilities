package com.zipcodewilmington;

import org.apache.commons.lang3.ArrayUtils;

import java.util.Arrays;

/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {
     //variable is already declared in the (String[] array)

        return array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {

        return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) { //always start with something you know
        //declare (type) (variableName) = (input)(help method)
        int lastElement = array.length-1;
        //.length this gets the total size of the array, capacity
        return array[lastElement];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {

        int secondToLastPosition = array.length-2;
        //.length-2 = minus the last two position because the index begins at zero.
        return array[secondToLastPosition];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
       //based on the two input value
        // we are comparing the value against the array
        //array.length checks the size of the array int.
        for(int i = 0; i < array.length; i++){
            if(array[i].equals(value)){
                //(Variable- Array) . equals(string method)(variable-value) { if statement
                //for loops better to return true so that you continue to check the
                //rest of the array for the equal value
                return true;
            }
        }
        return false;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        //create a new array labeled such, and it will contain the new array w/ length (w/ original array size)
        String[] reverseArray = new String[array.length];
        for(int i = array.length-1,reverseArrayPosition=0; i >= 0; i--,reverseArrayPosition++){
            reverseArray[reverseArrayPosition] = array[i];
        }
            //for loop = int i = length of array -1 (last position)
            //we will be reading the array from right to left based on the for loop

        return reverseArray;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {

        String[] reverseArray = reverse(array);
//        if(array == reverseArray);
        for (int i = 0; i < array.length; i++){
            if(!array[i].equals(reverseArray[i])){ //! bang operator - states if its not true do this
                return false;
            }
        }
        return true;
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        return false;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        //need to return a counter = int
        //track it outside the for loop
        //for loop to check array
        //set condtion that if the array equals the value add to counter
        //return the counter
        int counter = 0;
        for(int i = 0; i<array.length; i++){
            if(array[i].equals(value)){
                counter++;
            }
        }
        return counter;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {

        return ArrayUtils.removeElement(array,valueToRemove);
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {

        String[] newArray = new String[array.length]; //creating a new string array with the length
        String value = ""; //hold an empty string
        int counter = 0;

        for(int i=0; i < array.length; i++){
            if(!array[i].equals(value)){
                value = array[i];
                newArray[counter] = value; //this line will update the array to the unique
                counter++; //we increase counter the new position of the new array - this keep tracks of the
                //position in the new array and how many uniques we have seen
            }
        }

        String[] finalArray = Arrays.copyOf(newArray, counter); //creates an array with only the unique
        //values and specific amount of space in the value
        return finalArray;
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single
     * string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        return null;
    }


}
