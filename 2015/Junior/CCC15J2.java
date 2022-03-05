import java.util.*;

public class TestinLand {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine() + "   ";
		sc.close();
		
		
		int happy = 0;
		int sad = 0;
		
		for(int i = 0; i < input.length(); i++) {
			if(input.charAt(i) == ':') {
				if(input.substring(i, i + 3).contains(":-)"))
					happy++;
				else if(input.substring(i, i + 3).contains(":-("))
					sad++;
			}
		}
		
		if(happy > sad)
			System.out.println("happy");
		else if(sad > happy)
			System.out.println("sad");
		else if(sad == happy && sad != 0)
			System.out.println("unsure");
		else System.out.println("none");
	}
}
