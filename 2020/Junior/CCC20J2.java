import java.util.*;

public class TestinLand {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int p = sc.nextInt();
		int n = sc.nextInt();
		int r = sc.nextInt();
		sc.close();
		
		int total = n;
		int day = 0;
		
		while(total <= p) {
			day += 1;
			total += (Math.pow(r, day) * n);
		}
		System.out.println(day);
	}
}
