import java.util.*;

public class TestinLand {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		int b [] = new int [3];
		
		b[0] = sc.nextInt();
		b[1] = sc.nextInt();
		b[2] = sc.nextInt();
		sc.close();
		
		Arrays.sort(b);
		
		System.out.println(b[b.length - 2]);
	}
}
