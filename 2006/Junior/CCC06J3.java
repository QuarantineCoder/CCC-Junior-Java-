import java.util.*;

public class TestinLand {
	
    public static void main(String[] args){
    	
        Scanner sc = new Scanner(System.in);
       
        //Takes message input
        String input = sc.next();
        
        //Continues program until "halt" is entered
        while(!input.contains("halt")) {
        	
        	int seconds = 0;
        	char previous = ' ';
        	
        	//Loops though the inputs characters
        	for(int i = 0; i < input.length(); i++) {
        		
        		char letter = input.charAt(i);
        		
        		//If statements below check of how many seconds for each character
        		if(letter == 'a' || letter == 'd' || letter == 'g' || letter == 'j' || letter == 'm' || letter == 'p' || letter == 't' || letter == 'w') 
        			seconds += 1; 
        		else if(letter == 'b' || letter == 'e' || letter == 'h' || letter == 'k' || letter == 'n' || letter == 'q' || letter == 'u' || letter == 'x') 
        			seconds += 2;
        		else if(letter == 'c' || letter == 'f' || letter == 'i' || letter == 'l' || letter == 'o' || letter == 'r' || letter == 'v' || letter == 'y') 
        			seconds += 3;
        		else if(letter == 's' || letter == 'z') 
        			seconds += 4;

        		
        		//If statements below check if a space needs to be added so +2 second
            	if(letter == 'a' || letter == 'b' || letter == 'c') {
            		if(previous == 'a' || previous == 'b' || previous == 'c')
            			seconds += 2; 
            			
            	} else if(letter == 'd' || letter == 'e' || letter == 'f') {
            		if(previous == 'd' || previous == 'e' || previous == 'f') 
            			seconds += 2; 
            			
            	} else if(letter == 'g' || letter == 'h' || letter == 'i') {
            		if(previous == 'g' || previous == 'h' || previous == 'i') 
            			seconds += 2; 
            			
            	} else if(letter == 'j' || letter == 'k' || letter == 'l') {
            		if(previous == 'j' || previous == 'k' || previous == 'l') 
            			seconds += 2; 

            	} else if(letter == 'm' || letter == 'n' || letter == 'o') {
            		if(previous == 'm' || previous == 'n' || previous == 'o') 
            			seconds += 2; 
            			
            	} else if(letter == 'p' || letter == 'q' || letter == 'r' || letter == 's') {
            		if(previous == 'p' || previous == 'q' || previous == 'r' || previous == 's') 
            			seconds += 2; 
            			
            	} else if(letter == 't' || letter == 'u' || letter == 'v') {
            		if(previous == 't' || previous == 'u' || previous == 'v')
            			seconds += 2; 
            			
            	} else if(letter == 'w' || letter == 'x' || letter == 'y' || letter == 'z') {
            		if(previous == 'w' || previous == 'x' || previous == 'y' || previous == 'z')
            			seconds += 2; 
            	}
            	previous = input.charAt(i);
        	}
        	//Prints out amount of seconds
        	System.out.println(seconds);
        	
        	input = sc.next();
        } sc.close();
    }
}
