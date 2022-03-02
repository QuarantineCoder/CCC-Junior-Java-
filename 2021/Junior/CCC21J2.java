import java.util.*;

public class TestinLand {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String [] names = new String [n];
		int [] bids = new int [n];
		int [] bids2 = new int [n];
	
		for(int i = 0; i < n; i++) {
			names[i] = sc.next();
			bids[i] = sc.nextInt();
			bids2[i] = bids[i];
		}
		sc.close();
		
		Arrays.sort(bids);
		
		for(int i = 0; i < n; i++) {
			if(bids[bids.length - 1] == bids2[i]) {
				System.out.println(names[i]);
				break;
			}
		}
	}
}
