import java.util.*;

public class TestinLand {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String input = sc.next();
        String temp = "";
        
        while(!input.contains("99999")) {
        	
        	int sum = Integer.parseInt(input.substring(0, 1)) + Integer.parseInt(input.substring(1, 2));

        	if(sum == 0) {
        		System.out.print(temp);
        	} else if(sum % 2 == 0) {
        		System.out.print("right ");
        		temp = "right ";
        	} else { 
        		System.out.print("left ");
        		temp = "left ";
        	}
        	System.out.print(input.substring(2, 5));
        	System.out.println("");
        	
        	input = sc.next();
        } sc.close();
    }
}
