import java.util.*;

public class TestinLand {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int v = sc.nextInt();
		String vch = sc.next();
		sc.close();
		
		int a = 0;
		int b = 0;
		
		for(int i = 0; i < v; i++) {
			if(vch.charAt(i) == 'A')
				a++;
			else if (vch.charAt(i) == 'B')
				b++;
		}
		
		if(a > b)
			System.out.println("A");
		else if (b > a)
			System.out.println("B");
		else if(b == a && a != 0)
			System.out.println("Tie");
	}
}
