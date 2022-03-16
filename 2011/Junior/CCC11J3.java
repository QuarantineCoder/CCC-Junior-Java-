import java.util.*;

public class TestinLand {
	
    public static void main(String[] args){
    	
        Scanner sc = new Scanner(System.in);

        //Takes in first two numbers in the sumac sequence
        int t1 = sc.nextInt();
        int t2 = sc.nextInt();
        sc.close();
        
        int temp = 0;
        int count = 2;
        
        //Continues the sumac sequence until conditions are meant
        while(true) {
        	temp = t1;
        	t1 = t2;
        	t2 = temp - t2;
        
        	count++;
        	
        	//Condition to break the sumac sequence
        	if(t1 < t2)
        		break;
        }
        //Prints to console the numbers in the sumac sequence
        System.out.println(count);
    }
}
