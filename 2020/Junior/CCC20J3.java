import java.util.*;

public class TestinLand {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        
        int [] num = new int [n];
        int [] num1 = new int [n];
        
        for(int i = 0; i < n; i++) {
			String[] temp = sc.next().split(",");
			num[i] = Integer.parseInt(temp[0]);
			num1[i] = Integer.parseInt(temp[1]);
        } sc.close();
        
		int numMin = 101;
		int numMax = 0;
		int num1Min = 101;
		int num1Max = 0;
		
		for (int i = 0; i < n; i++) {
			if (num[i] < numMin) {
				numMin = num[i];
			}
			if (num[i] > numMax) {
				numMax = num[i];
			}
			if (num1[i] < num1Min) {
				num1Min = num1[i];
			}
			if (num1[i] > num1Max) {
				num1Max = num1[i];
			}
		}
		System.out.println((numMin - 1) + "," + (num1Min - 1));
		System.out.println((numMax + 1) + "," + (num1Max + 1));
    }
}
