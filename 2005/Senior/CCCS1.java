import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CCCPractice {

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//Takes input for amount of phone numbers
		int t = Integer.parseInt(br.readLine());
		
		//Takes the phone number n amount
		for(int i = 0; i < t; i++) {
			String number = br.readLine().replace("-", "");
			
			String newNumber = "";
			
			//Loops through each character to change it to its correct value
			for(int j = 0; j < 10; j++) {
				char character = number.charAt(j);
				if(Character.isAlphabetic(character)) {
					if(character == 'A' || character == 'B' || character == 'C') {
						newNumber += "2";
					} else if(character == 'D' || character == 'E' || character == 'F') {
						newNumber += "3";
					} else if(character == 'G' || character == 'H' || character == 'I') {
						newNumber += "4";
					} else if(character == 'J' || character == 'K' || character == 'L') {
						newNumber += "5";
					} else if(character == 'M' || character == 'N' || character == 'O') {
						newNumber += "6";
					} else if(character == 'P' || character == 'Q' || character == 'R' || character == 'S') {
						newNumber += "7";
					} else if(character == 'T' || character == 'U' || character == 'V') {
						newNumber += "8";
					} else if(character == 'W' || character == 'X' || character == 'Y' || character == 'Z') {
						newNumber += "9";
					}
				} else newNumber += character;
			}
			//Adds hyphens and prints out new number
			newNumber = newNumber.substring(0,3) + "-" + newNumber.substring(3,6) + "-" + newNumber.substring(6,10);
			System.out.println(newNumber);
		}
	}
}
