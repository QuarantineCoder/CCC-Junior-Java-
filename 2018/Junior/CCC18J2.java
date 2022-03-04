import java.util.*;

public class TestinLand {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String row1 = sc.next();
		String row2 = sc.next();
		int total = 0;
		
		for(int i = 0; i < n; i++) {
			if((row1.charAt(i) == row2.charAt(i)) && row1.charAt(i) == 'C') {
				total++;
			}
		}
		System.out.println(total);
	}
}
