import java.util.*;

public class TestinLand {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		sc.close();
				
		int sum = 91 + n1 * 1 + n2 * 3 + n3 *1;
		
		System.out.println("The 1-3-sum is " + sum);	
	}
}
