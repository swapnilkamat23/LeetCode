/**
 * Author: Swapnil Kamat
 */

import java.util.*;

public class ValidParantheses {
	
	public static boolean isValid(String s) {
        Stack startParan = new Stack();
        
        // map for different types of parantheses
        Map parantheses = new HashMap();
        parantheses.put('{','}');
        parantheses.put('(',')');
        parantheses.put('[',']');
        
        // loop through all the chars in string s
        for(int i=0; i<s.length(); i++){
            char current = s.charAt(i);
            // push opening parantheses on to the stack
            if(parantheses.containsKey(current)){
                startParan.push(current);
            }
            else{
                // if there are no opening parantheses for the current ending parantheses
                if(startParan.empty()){
                    return false;
                }
                else{
                    // check for parantheses mis-match
                    if((char)parantheses.get(startParan.pop())!=current){
                        return false;
                    }
                }
            }
        }
        
        // check if there are any unclosed parantheses in the stack
        return startParan.empty();
    }
	
	public static void main(String args[]){
		String input = "[(){()}]";
		System.out.println("Parantheses in the string " + input + " are " + ((isValid(input))?"valid":"not valid"));
	}

}
