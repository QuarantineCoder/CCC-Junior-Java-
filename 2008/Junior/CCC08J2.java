import java.util.*;

public class TestinLand {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String songs = "ABCDE";
		
		int b = 0;
		int n = 0;
		
		while(b != 4) {
			
			b = sc.nextInt();
			n = sc.nextInt();
			
			while(n != 0) {
				if(b == 1) {
					songs = songs.substring(1) + songs.charAt(0);
				} else if(b == 2) {
					songs = "" + songs.charAt(4) + songs.substring(0, 4);
				} else if(b == 3) {
					songs = "" + songs.charAt(1) + songs.charAt(0) + songs.substring(2);
				}
				n--;
			}
		} sc.close();
		
		System.out.println(songs.charAt(0) + " " + songs.charAt(1) + " " + songs.charAt(2) + " " + songs.charAt(3) + " " + songs.charAt(4));
	}	
}
