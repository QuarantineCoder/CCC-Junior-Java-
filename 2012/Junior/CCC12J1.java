import java.util.*;

public class TestinLand {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);

		int sl = sc.nextInt();
		int cs = sc.nextInt();
		sc.close();
		
		int diff = cs - sl;
		
		if(diff <= 0)
			System.out.println("Congratulations, you are within the speed limit!");
		else if(diff >= 1 && diff <= 20)
			System.out.println("You are speeding and your fine is $100.");
		else if(diff >= 21 && diff <= 30)
			System.out.println("You are speeding and your fine is $270.");
		else if(diff >=30)
			System.out.println("You are speeding and your fine is $500.");
	}
}
