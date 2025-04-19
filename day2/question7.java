package day2;
import java.util.HashMap;
import java.util.Hashtable;

public class question7 {

    /* Question 7
    * Check Permutation: 
    * Given two strings, write a method to decide if one is a permutation of the other.
    */


    public boolean checkPermutation(String firstString, String secondString){

        if(firstString.length() != secondString.length()){
            return false;
        }

        HashMap<Character, Boolean> map = new HashMap<>();

        for(int i=0; i<firstString.length(); i++){
            //add to hashmap

        }

        //check hashmap there is any string if no, return false.

        return false;
    }
    
}
