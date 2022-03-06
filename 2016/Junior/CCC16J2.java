import java.util.*;

public class TestinLand {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int [][] square = new int [4][4];
		
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 4; j++) {
				square[i][j] = sc.nextInt();
			}
		} 
		sc.close();
		
		int [] rows = new int [4];
		int [] columns = new int [4];
		
		for(int i = 0; i < 4; i++) {
			rows[0] += square[0][i];
			rows[1] += square[1][i];
			rows[2] += square[2][i];
			rows[3] += square[3][i];
			
			columns[0] += square[i][0];
			columns[1] += square[i][1];
			columns[2] += square[i][2];
			columns[3] += square[i][3];
		}
		if(rows[0] == rows[1] && rows[1] == rows[2] && rows[2] == rows[3]) {
			if(columns[0] == columns[1] && columns[1] == columns[2] && columns[2] == columns[3]) {
				if(rows[0] == columns[0]) {
					System.out.println("magic");
				}
			}
		}else System.out.println("not magic");
	}
}
