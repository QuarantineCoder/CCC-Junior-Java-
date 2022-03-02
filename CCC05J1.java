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
		
		double planAT =(planA[1] * evening) + (planA[2] * weekend);
		if(daytime > 100)
			planAT += ((planA[0] * daytime) - 25);
		
		double planBT =(planB[1] * evening) + (planB[2] * weekend);
		if(daytime > 250) {
			planBT += ((planB[0] * daytime) - 112.5);
		}
		
		planAT = rounder(planAT);
		planBT = rounder(planBT);
		
		System.out.println("Plan A costs " + planAT);
		System.out.println("Plan B costs " + planBT);
		
		if(planAT > planBT)
			System.out.println("Plan B is cheapest.");
		else if(planAT == planBT)
			System.out.println("Plan A and B are the same price.");
		else System.out.println("Plan A is cheapest.");
	}
	
	public static double rounder(double a) {
		a = a * 100;
		a = Math.round(a);
		a = a / 100;
		
		return a;
	}
}
