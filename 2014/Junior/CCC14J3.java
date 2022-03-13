import java.util.*;

public class TestinLand {
	
    public static void main(String[] args){
    	
        Scanner sc = new Scanner(System.in);
        
        //Starting scores
        int davidScore = 100;
        int antoniaScore = 100;
        
        //Stores number of rolls per player
        int numOfRolls = sc.nextInt();
       
        //Stores scores for each player
        int david [] = new int [numOfRolls];
        int antonia [] = new int [numOfRolls];
       
        //Takes players score inputs and stores in respective arrays
        for(int i = 0; i < numOfRolls; i++) {
        	antonia[i] = sc.nextInt();
        	david[i] = sc.nextInt();
        } sc.close();
        
        //Loops through player scores arrays
        for(int i = 0; i < numOfRolls; i++) {
        	//Checks if Antonia has a higher score
        	if(antonia[i] > david[i])
        		davidScore -= antonia[i];
        	//Checks if David has a higher score
        	else if(antonia[i] < david[i])
        		antoniaScore -= david[i];
        }
        //Prints out score of Antonia and David
        System.out.println(antoniaScore);
        System.out.println(davidScore);
    }
}
