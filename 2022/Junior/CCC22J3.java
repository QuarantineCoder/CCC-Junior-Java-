import java.util.*;

public class TestinLand {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String input = sc.next();
        sc.close();

        for(int i = 0; i < input.length(); i++) {
        	
        	if(input.charAt(i) != '+' && input.charAt(i) != '-' && !Character.isDigit(input.charAt(i))) {
        		System.out.print(input.charAt(i));
        	
        	} else if(input.charAt(i) == '+' || input.charAt(i) == '-') {
        		
        		if(input.charAt(i) == '+') 
        			System.out.print(" tighten ");
        		else
        			System.out.print(" loosen ");
        		
        	} else if(Character.isDigit(input.charAt(i))) {
                
        		while (i < input.length() && Character.isDigit(input.charAt(i))) {
                    System.out.print(input.charAt(i));
                    i++;
                }
        		i--;
        		System.out.println("");
        	}
        }
    }
}
