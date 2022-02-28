import java.util.*;
import java.io.*;

public class TestinLand {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		int s = sc.nextInt() * 1;
		int m = sc.nextInt() * 2;
		int l = sc.nextInt() * 3;
		
		int v = s + m + l;
		
		if(v > 9)
			System.out.println("happy");
		else System.out.println("sad");
	}
}
