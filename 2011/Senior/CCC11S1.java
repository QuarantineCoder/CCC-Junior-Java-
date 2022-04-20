import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CCCPractice {

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//Takes input for the amount of lines
		int numberOfLines = Integer.parseInt(br.readLine());
		
		int totalT = 0;
		int totalS = 0;
		
		//Allows you to input a line n number of time
		for(int i = 0; i < numberOfLines; i++) {
			String line = br.readLine();
			
			//Loops through each letter to see if its a t or s
			for(int j = 0; j < line.length(); j++) {
				String letter = line.charAt(j) + " ";
				letter = letter.toLowerCase();
				if(letter.contains("t"))
					totalT++;
				else if(letter.contains("s"))
					totalS++;
			}
		}
		//Prints out the language
		if(totalT > totalS) {
			System.out.println("English");
		} else 
			System.out.println("French");
	}
}
