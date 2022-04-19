import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CCCPractice {

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//Takes the input and stores each letter into an array 
		String [] a = br.readLine().replace(" ", "").split("");
		String [] b = br.readLine().replace(" ", "").split("");

		//Not an anagram if lengths aren't the same
		if(a.length != b.length) {
			System.out.println("Is not an anagram.");
			return;
		}
		
		//Goes through array b to see if all the letter in array a have been used
		int count = 0;
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < b.length; j++) {
				if(a[i].contains(b[j])) {
					b[j] = " ";
					count++;
					break;
				}
			}
		}
		
		//Prints out whether or not its an anagram
		if(count == a.length) {
			System.out.println("Is an anagram.");
		} else System.out.println("Is not an anagram.");
	}
}
