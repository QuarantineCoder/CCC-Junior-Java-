import java.util.*;

public class TestinLand {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		sc.close();
		
		x = (int) Math.sqrt(x);
		 
		System.out.println("The largest square has side length " + x + "."); 
	}
}
