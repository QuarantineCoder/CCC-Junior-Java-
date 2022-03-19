import java.util.*;

public class TestinLand {
	
    public static void main(String[] args){
    	
    	Scanner sc = new Scanner(System.in);    	
    	
    	//Takes inputs for humidity and waiting time
    	int h = sc.nextInt();
    	int m = sc.nextInt();
    	sc.close();
    	
    	int t = 0;
    	int a = 1;
    	
    	//Runs the program until the balloon touches the ground
    	while(a > 0) {
    		t++;
    		a = (int) ((-6 * Math.pow(t,4)) + (h * Math.pow(t,3)) + (2 * Math.pow(t,2)) + t);
    	}
    	
    	//Prints whether the balloon reached the ground in time or not
    	if(t <= m)
    		System.out.println("The balloon first touches ground at hour:\n" + t);
    	else System.out.println("The balloon does not touch ground in the given time.");
    }
}
