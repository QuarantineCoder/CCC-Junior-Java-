import java.util.*;

public class TestinLand {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);

		int y = sc.nextInt();
		int m = sc.nextInt();
		
		sc.close();
		int diff = m - y;
		
		System.out.println(m + diff);
	}
}
