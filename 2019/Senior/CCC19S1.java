import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CCCPractice {

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//Takes input for sequence and creates board
		String sequence = br.readLine();
		String [] board = {"1", "2", "3", "4"};
		
		//Cycles through sequence
		for(int i = 0; i < sequence.length(); i++) {
			String HV = sequence.charAt(i) + "K";
			
			//Flips board Horizontally
			if(HV.contains("H")) {
				String temp = board[0];
				String temp1 = board[1];
				
				board[0] = board[2];
				board[1] = board[3];
				
				board[2] = temp;
				board[3] = temp1;
			} 	
			//Flips board vertically 
			else {
				String temp = board[0];
				String temp1 = board[2];
				
				board[0] = board[1];
				board[2] = board[3];
				
				board[1] = temp;
				board[3] = temp1;
			}
		}
		//Prints out board after sequence is applied
		System.out.println(board[0] + " " + board[1]);
		System.out.println(board[2] + " " + board[3]);
	}
}
