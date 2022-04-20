import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CCCPractice {

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//Takes in input for teams scores
		int n = Integer.parseInt(br.readLine());
		String [] teamScores1 = br.readLine().split(" ");
		String [] teamScores2 = br.readLine().split(" ");
		
		//Holds values
		int team1Total = 0;
		int team2Total = 0;
		int days = -1;
		
		//Calculates the total scores each day
		for(int i = 0; i < n; i++) {
			team1Total += Integer.parseInt(teamScores1[i]);
			team2Total += Integer.parseInt(teamScores2[i]);
			
			//Stores the day where latest day where runs are the same
			if(team1Total == team2Total)
				days = i;
		}
		//Prints out latest day
		System.out.println(days + 1);
	}
}
