import java.util.*;

public class TestinLand {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int m = sc.nextInt();
		int n = sc.nextInt();
		sc.close();
		
		int total = 0;
		
		for(int i = 1; i <= m; i++) {
			for(int j = 1; j <= n; j++) {
				if(i + j == 10)
					total++;
			}
		}
		if(total == 1)
			System.out.println("There is " + total + " way to get the sum 10.");
		else System.out.println("There are " + total + " ways to get the sum 10.");
	}
}
