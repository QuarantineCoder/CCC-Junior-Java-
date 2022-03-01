import java.util.*;

public class TestinLand {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		double w = sc.nextDouble();
		double h = sc.nextDouble();
		sc.close();
		
		double bmi = w / (h * h);
		
		if (bmi > 25)
			System.out.println("Overweight");
		else if(bmi >= 18.5 && bmi <= 25)
			System.out.println("Normal weight");
		else if(bmi < 18.5)
			System.out.println("Underweight");
	}
}
