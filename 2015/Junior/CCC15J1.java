import java.util.*;

public class TestinLand {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		int m = sc.nextInt();
		int d = sc.nextInt();
		sc.close();
		
		if(m < 2 || (m ==2 && d < 18))
			System.out.println("Before");
		else if(m > 2 ||(m == 2 && d > 18))
			System.out.println("After");
		else System.out.println("Special");
	}
}
