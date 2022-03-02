import java.util.*;

public class TestinLand {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int o = 0;
		
		for(int i = 0; i < n; i++) {
			int t1 = sc.nextInt();
			int t2 = sc.nextInt();
			if(t1 * 5 - t2 *3 > 40) {
				o++;
			}
		}
		sc.close();
		if(n == o) 
			System.out.println(o + "+");
		else System.out.println(o);
	}
}
