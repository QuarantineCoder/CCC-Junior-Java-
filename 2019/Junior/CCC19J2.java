import java.util.*;

public class TestinLand {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int l = sc.nextInt();
		
		int [] times = new int [l];
		String [] alpha = new String [l];
		
		for(int i = 0; i < l; i++) {
			times[i] = sc.nextInt();
			alpha[i] = sc.next();
		}
		sc.close();
		
		int j = 0;
		int k = 0;
		while(l != k) {
			for(int i = 0; i < times[j]; i++) {
				System.out.print(alpha[j]);
			}
			System.out.println("");
			j++;
			k++;
		}
	}
}
