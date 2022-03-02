import java.util.*;

public class TestinLand {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		int a = (sc.nextInt() * 3) + (sc.nextInt()*2) + (sc.nextInt());
		int b = (sc.nextInt() * 3) + (sc.nextInt()*2) + (sc.nextInt());
		
		sc.close();
		if(a > b)
			System.out.println("A");
		else if(a < b)
			System.out.println("B");
		else System.out.println("T");
	}
}
