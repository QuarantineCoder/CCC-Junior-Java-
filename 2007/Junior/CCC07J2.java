import java.util.*;

public class TestinLand {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//Takes message an stores it
		String input = sc.next();
		
		//Converts abbreviation to english message until TTYL is entered
		while(!input.contains("TTYL")) {
			if(input.contains("CU")) 
				System.out.println("see you");
			else if(input.contains(":-)"))
				System.out.println("I'm happy");
			else if (input.contains(":-("))
				System.out.println("I'm unhappy");
			else if(input.contains(";-)"))
				System.out.println("wink");
			else if (input.contains(":-P"))
				System.out.println("stick out my tongue");
			else if(input.contains("(~.~)"))
				System.out.println("sleepy");
			else if (input.contains("TA"))
				System.out.println("totally awesome");
			else if(input.contains("CCC"))
				System.out.println("Canadian Computing Competition");
			else if (input.contains("CUZ"))
				System.out.println("because");
			else if(input.contains("TY"))
				System.out.println("thank-you");
			else if (input.contains("YW"))
				System.out.println("you're welcome");
			else System.out.println(input);
			
			input = sc.next();
		}sc.close();
		
		//Prints the abbreviation to TTYL
		System.out.println("talk to you later");
	}
}
