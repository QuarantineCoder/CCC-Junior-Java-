import java.util.*;

public class TestinLand {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		int [] burgers = {461, 431, 420, 0};
		int [] sides = {100, 57, 70, 0};
		int [] drinks = {130, 160, 118, 0}; 
		int [] desserts = {167, 266, 75, 0}; 
		
		int burger = sc.nextInt();
		int side = sc.nextInt();
		int drink = sc.nextInt();
		int dessert = sc.nextInt();
		
		sc.close();
		int total = burgers[burger -1] + sides[side - 1] + drinks[drink - 1] + desserts[dessert - 1];
		
		System.out.println("Your total Calorie count is " + total + ".");
	}
}
