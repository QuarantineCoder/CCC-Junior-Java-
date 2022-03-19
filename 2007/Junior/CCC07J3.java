import java.util.*;

public class TestinLand {
	
    public static void main(String[] args){
    	
    	Scanner sc = new Scanner(System.in);    	
    	
    	//Takes in the amount of briefcases opened
    	int n = sc.nextInt();
    	
    	//Holds briefcase values
    	int [] caseValues = {100, 500, 1000, 5000, 10000, 25000, 50000, 100000, 500000, 1000000};
    	
    	//Takes the opened briefcases and sets their values to 0
    	for(int i = 0; i < n; i++) 
    		caseValues[(sc.nextInt() - 1)] = 0;
    	
    	//Takes in and stores the bankers offer
    	int bankersOffer = sc.nextInt();
    	sc.close();
    	
    	//Calculates the players average
    	int playersAvg = (caseValues[0] + caseValues[1] + caseValues[2] + caseValues[3] + caseValues[4] + caseValues[5] + caseValues[6] + caseValues[7] + caseValues[8] + caseValues[9]) / (10 - n);
    	
    	//Checks who offer is higher
    	if(bankersOffer > playersAvg)
    		System.out.println("deal");
    	else System.out.println("no deal");
    }
}
