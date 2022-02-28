import java.util.*;
import java.io.*;

public class TestinLand {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		String [] g = new String[6];
		g[0] = sc.next();
		g[1] = sc.next();
		g[2] = sc.next();
		g[3] = sc.next();
		g[4] = sc.next();
		g[5] = sc.next();
		int j = 0;
		
		for(int i = 0; i < g.length; i++) {
			if(g[i].equals("W"))
				j++;
		}
		if(j == 5 || j == 6)
			System.out.println("1");
		else if(j == 3 || j == 4)
			System.out.println("2");
		else if(j == 1 || j == 2)
			System.out.println("3");
		else System.out.println("-1");
	}
}
