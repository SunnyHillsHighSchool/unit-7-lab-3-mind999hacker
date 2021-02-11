//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class ArrayListFunHouse
{
 public static ArrayList<Integer> getListOfFactors(int number)
 {
   ArrayList<Integer> output = new ArrayList<Integer>(); //make a new empty list

  for(int i = 2; i <= number; i++) { //loop until the number
			if(number%i == 0 && i!=number) { //check if remainder of number / i ==0 and i not the number
				output.add(i); //add i to list
			}
		}
    //keepOnlyCompositeNumbers(output);
    return output; //return new list
 }
  public static void keepOnlyCompositeNumbers( List<Integer> nums )
 {
   for (int i = 0; i < nums.size(); i++)  //loop thru all cells of loop
   {
     if (primeCheck(nums.get(i)))  //use method primeCheck to see if the currunt cell number is a prime or not
     {
       nums.remove(i); //if it is remove it
       i=i-1; //remove 1 from 1
     }
   }
}

public static boolean primeCheck(Integer n) {
        for (int i = 2; i < n; i++) { //loop from 2 until n
            if (n % i == 0) { //check if n % i remainder is == 0
                return false; // if yes return false
            }
        }
        return true; //return true if if statement was false
    }

}