import java.util.*;

public class TestinLand {
	
    public static void main(String[] args){
    	
    	Scanner sc = new Scanner(System.in);    	
    	int a = 0;
    	int b = 0;
    	
    	while(true) {
    		String [] instructions = sc.nextLine().split(" ");
    		
    		//Stops program
    		if(instructions[0].equals("7"))
    			break;
    		
    		switch(instructions[0]) {
    		
    		//Stores value n in X
    		case "1":
    			if(instructions[1].equals("A"))
    				a = Integer.parseInt(instructions[2]);
    			else b = Integer.parseInt(instructions[2]);
    			break;
    			
    		//Prints out variable X 
    		case "2":
    			if(instructions[1].equals("A"))
    				System.out.println(a);
    			else System.out.println(b);
    			break;
    		
    		//Adds X + Y and stores it in X
    		case "3":
    			if(instructions[1].equals("A")) 
    				a = a + b;
    			else b = b + a;
    			break;
    			
    		//Multiples X * Y and stores result in X
    		case "4":
    			if(instructions[1].equals("A")) 
    				a = a * b;
    			else b = b * a;
    			break;
    			
    		//Subtracts X - Y and stores result in X
    		case "5":
    			if(instructions[1].equals("A")) 
    				a = a - b;
    			else b = b - a;
    			break;
    			
    		//Divides X / Y and stores result in X
    		case "6":
    			if(instructions[1].equals("A")) 
    				a = (int) a / b;
    			else b = (int) b / a;
    		}
    	} sc.close();
    }
}
