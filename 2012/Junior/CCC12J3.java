import java.util.*;

public class TestinLand {
	
    public static void main(String[] args){
    	
    	Scanner sc = new Scanner(System.in);
    	
    	//Takes in input and store it in int k
    	int k = sc.nextInt();
    	sc.close();
    	
    	//Prints out "*" & "x" & "*" k number of times
    	for(int i = 0; i < k; i++) {
    		System.out.print("*".repeat(k));
    		System.out.print("x".repeat(k));
    		System.out.print("*".repeat(k) + "\n");
    	}
    	//Prints out " " & "xx" k number of times
    	for(int i = 0; i < k; i++) {
    		System.out.print(" ".repeat(k));
    		System.out.print("xx".repeat(k) + "\n");
    	}
    	//Prints out "*" & " " & "*" k number of times 
    	for(int i = 0; i < k; i++) {
    		System.out.print("*".repeat(k));
    		System.out.print(" ".repeat(k));
    		System.out.print("*".repeat(k) + "\n");
    	}
    }
}
