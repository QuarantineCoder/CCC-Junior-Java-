import java.util.*;

public class TestinLand {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        //Takes in the amount of Sequences that will be inputed
        int numOfLines = sc.nextInt();
        
        //Stores the different sequences
        String [] sequences = new String [numOfLines];
        
        //Allows the sequences to be inputed then stored
        for(int i = 0; i < numOfLines; i++) {
        	sequences[i] = sc.next() + " ";
        } sc.close();

        //Loops through the sequences array 
        for(int i = 0; i < numOfLines; i++) {
        	//Counts occurrences of character
        	int count = 1;
        	//Stores character
        	String temp = "";
        	
        	//Loops through the sequence
        	for(int j = 0; j < sequences[i].length() - 1; j++) {
        		
        		//Checks if character occurs more than once
        		if(sequences[i].charAt(j) == sequences[i].charAt(j + 1)) {
        			count++;
        			temp = String.valueOf(sequences[i].charAt(j));
        		} 
        		//Prints out the multiple occurrence characters
        		else if (count != 1 ) {
        			System.out.print(count + " " + temp + " ");
        			count = 1;
        		} 
        		//Prints out the characters with single occurrences
        		else {
        			System.out.print(count + " " + sequences[i].charAt(j) + " ");
        		}
        	}
        	//Next line
        	System.out.println("");
        }
    }
}
