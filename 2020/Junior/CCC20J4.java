import java.io.*;
import java.util.*;

public class TestinLand {
	
    public static void main(String[] args) throws IOException{
    	
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    	//Takes input for Text and String
    	String t = br.readLine();
    	String s = br.readLine();
    	br.close();
    	
    	boolean contains = false;
    	
    	//Stores all variations of strings
    	ArrayList<String> shifts = new ArrayList<>();
    	shifts.add(s);
    	
    	//Puts first character to end till all it finds a match or not
    	for(int i = 0; i < s.length(); i++) {
    		String word = shifts.get(i);
    		if(t.contains(word))
    			contains = true;
    		
    		String newWord = word.substring(1) + word.charAt(0);
    		shifts.add(newWord);
    	}
    	//Checks whether text contained String
    	if(contains)
    		System.out.println("yes");
    	else System.out.println("no");
    }
}
