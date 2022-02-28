import java.util.*;
import java.io.*;

public class TestinLand {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int j = 0;
		
		sc.close();
		
		if(a == 8 || a == 9)
			j++;
		if(b == c)
			j++;
		if(d == 8 || d == 9)
			j++;
		if(j == 3)
			System.out.println("ignore");
		else System.out.println("answer");
	}
}
