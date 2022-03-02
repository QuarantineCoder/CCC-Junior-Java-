import java.util.*;

public class TestinLand {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		int P = 5 * sc.nextInt() - 400;
		int j;
		sc.close();
		System.out.println(P);
		
		if(P > 100)
			j = -1;
		else if(P < 100)
			j = 1;
		else j = 0;
		System.out.println(j);
			
	}
}
