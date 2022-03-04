import java.util.*;

public class TestinLand {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String input = sc.next();
		sc.close();
		
		int c = 0;
		
		for(int i = 0; i < input.length(); i++) {
			if(String.valueOf(input.charAt(i)).matches("[IOSHZXN]"))
				c++;
		}
		if(c == input.length())
			System.out.println("YES");
		else System.out.println("NO");
	}
}
