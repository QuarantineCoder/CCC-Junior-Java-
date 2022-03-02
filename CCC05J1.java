import java.util.*;

public class TestinLand {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		double [] planA = {0.25, 0.15, 0.20};
		double [] planB = {0.45, 0.35, 0.25};
		
		int daytime = sc.nextInt();
		int evening = sc.nextInt();
		int weekend = sc.nextInt();
		sc.close();
		
		double planAT = (planA[0] * (daytime - 100)) + (planA[1] * evening) + (planA[2] * weekend);
		double planBT = (planB[0] * (daytime - 250)) + (planB[1] * evening) + (planB[2] * weekend);
		
		System.out.println("Plan A costs " + planAT);
		System.out.println("Plan B costs " + planBT);
		
		if(planAT > planBT)
			System.out.println("Plan B is cheapest.");
		else if(planAT == planBT)
			System.out.println("Plan A and B are the same price.");
		else System.out.println("Plan A is cheapest.");
	}
}
