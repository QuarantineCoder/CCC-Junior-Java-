import java.util.*;

public class TestinLand {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int inp = sc.nextInt();
		int inp1 = sc.nextInt();
		sc.close();
		
		int total = 0;
		
		for(int i = inp; i <= inp1; i++) {
			int temp = 0;
			for(int j = 1; j <= i; j++) {
				if(i % j == 0)
					temp++;
			}
			if(temp == 4)
				total++;
		}
		System.out.println("The number of RSA numbers between " + inp + " and " + inp1 + " is "+ total);
	}
}
