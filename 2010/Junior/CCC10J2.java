import java.util.*;

public class TestinLand {
	
    public static void main(String[] args){
    	
    	Scanner sc = new Scanner(System.in);    	
    	
    	//Takes inputs for Nikky and Byron forward and backward steps and amount of steps
    	int a = sc.nextInt();
    	int b = sc.nextInt();
    	
    	int c = sc.nextInt();
    	int d = sc.nextInt();
    	
    	int s = sc.nextInt();
    	sc.close();
    	
    	//Nikky steps
    	int nikky = (s / (a + b)) * (a - b);
    	int nikkyLeft = s % (a + b);
    	nikky += nikkyLeft;
    	
    	if(nikkyLeft > a)
    		nikky -= (nikkyLeft - a);
    	
    	//Byron steps
    	int byron = (s / (c + d)) * (c - d);
    	int byronLeft = s % (c + d);
    	byron += byronLeft;
    	
    	if(byronLeft > c)
    		nikky -= (nikkyLeft - c);
    	
    	//Prints to console who was further ahead or tied
		if (nikky > byron) 
			System.out.println("Nikky");
		else if (byron > nikky) 
			System.out.println("Byron");
		else System.out.println("Tied");
    }
}
