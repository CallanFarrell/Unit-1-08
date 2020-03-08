import java.util.Arrays;
import java.util.Random;
/***********************************.
 * Created by: Callan Farrell.
 * Created on: March 2020
 * Created for: ICS4U
 * This program generates 10 numbers from 1-99 and shows the user the lowest
 * value in the list
 ****************************************************************************/

public class MaxMinArray {
  /*******
  *Max Min code.
  *****/
  public static void main(String[] arg) {
    Random rand = new Random();

    int[] intArray;
    
    // Creates an array with 10 indexes
    intArray = new int[10];

    // Adds a random number from 1-99 into the array for every index
    for (int index = 0; index < intArray.length; index++) {
      intArray[index] = rand.nextInt(99) + 1;
    }

    // Prints the array
    int maxValue;
    System.out.println(Arrays.toString(intArray));
    maxValue = maxValue(intArray);
    int minValue;
    minValue = minValue(intArray);

    // Prints the max and min values
    System.out.printf("The maximum value is : %d%n", maxValue);
    System.out.printf("The minimum value is : %d%n", minValue);
  }

  /*******
  *Created by Callan
  *****/
  public static int maxValue(int[] intArray) {
    int maxValue;
    maxValue = intArray[0];

    // Finds maximum value
    for (int index = 1; index < intArray.length; index++) {
      if (index < intArray.length - 1) {
        if (intArray[index] > maxValue) {
          maxValue = intArray[index];
        }
      }
    }
    return maxValue;
  }

  /*******
  *Created in march
  *****/
  public static int minValue(int[] intArray) {
    int minValue;
    minValue = intArray[0];

    // Finds minimum value
    for (int index = 1; index < intArray.length; index++) {
      if (index < intArray.length - 1) {
        if (intArray[index] < minValue) {
          minValue = intArray[index];
        }
      }
    }
    return minValue;
  }
}