import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int [] h = new int [n+1];
		int [] w = new int [n];
		
		for(int i = 0; i < h.length; i++) {
			h[i] = sc.nextInt();
		}
		for(int j = 0; j < w.length; j++) {
			w[j] = sc.nextInt();
		}
		sc.close();
		double area = 0;
		for(int k = 0; k < n; k++) {
			double t = (double) ((h [k] + h [k + 1] ) * w [k]) / 2;
			area+=t;
		}
		System.out.println(area);
	}

}
