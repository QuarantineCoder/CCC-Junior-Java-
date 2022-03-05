import java.util.*;

public class TestinLand {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int [] depths = new int [4];
		depths[0] = sc.nextInt();
		depths[1] = sc.nextInt();
		depths[2] = sc.nextInt();
		depths[3] = sc.nextInt();
		sc.close();
		
		int temp = 0;
		int temp1 = 0;
		int temp2= 0;

		for(int i = 0; i < 3; i++) {
			if(depths[i] == depths[i + 1])
				temp++;
			else if(depths[i] < depths[i + 1])
				temp1++;
			else if(depths[i] > depths[i + 1])
				temp2++;
		}
		if(temp == 3)
			System.out.println("Fish At Constant Depth");
		else if(temp1 == 3)
			System.out.println("Fish Rising");
		else if(temp2 == 3)
			System.out.println("Fish Diving");
		else System.out.println("No Fish");
	}
}
