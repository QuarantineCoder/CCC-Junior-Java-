import java.util.*;

public class TestinLand {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String n = sc.next();
		int k = sc.nextInt();
		sc.close();
		
		int total = 0;
		
		if(k >= 0) 
			total += Integer.parseInt(n);
		if(k >= 1) 
			total += Integer.parseInt(n + "0");
		if(k >= 2)
			total += Integer.parseInt(n + "00"); 
		if(k >= 3)
			total += Integer.parseInt(n + "000");
		if(k >= 4)
			total += Integer.parseInt(n + "0000");
		if(k >= 5)
			total += Integer.parseInt(n + "00000");
	
		System.out.println(total);
	}
}
