import java.util.*;

public class TestinLand {
	
    public static void main(String[] args){
    	
    	Scanner sc = new Scanner(System.in);
    	
    	//Takes input and stores it
    	String word = sc.next();
    	sc.close();
    	
    	String constants = "bcdfghjklmnpqrstvwxyz";
    	String newWord = "";
    	
    	//Loops through word 
    	for(int i = 0; i < word.length(); i++) {
    		String letter = "" + word.charAt(i);
    		
    		//Letter is not a vowel
    		if(!"aeiou".contains(letter)) {
    			newWord += letter;
    			
    			//Checks the nearest vowel to letter
    			if("bc".contains(letter))
    				newWord += "a";
    			else if("dfg".contains(letter))
    				newWord += "e";
    			else if("hjkl".contains(letter))
    				newWord += "i";
    			else if("mnpqr".contains(letter))
    				newWord += "o";
    			else if("stvwxyz".contains(letter)) {
    				newWord += "u";
    			}
    			
    			//Loops through the constants
        		for(int j = 0; j < constants.length(); j++ ) {
        			
        			//Finds nearest next constant to our letter
        			if(letter.equals("z")) {
        				newWord += "z";
        				break;
        			} else if(letter.equals("" + constants.charAt(j))) {
        				newWord += constants.charAt(j + 1);
        				break;
        			}
        		}
    		} else newWord += letter;
    	}
    	//Prints Rövarspråket translation
    	System.out.println(newWord);
    }
}
