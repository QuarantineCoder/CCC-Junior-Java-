import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CCCPractice {

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String coldestCity = "";
		int coldest = Integer.MAX_VALUE;
		
		while(true) {
			
			//Takes input for city and temperature
			String []data = br.readLine().split(" ");
			String city = data[0];
			int temperature = Integer.parseInt(data[1]);
			
			//Checks for lower temperature
			if(temperature < coldest) {
				coldestCity = city;
				coldest = temperature;
			}

			//Breaks out of the loop when Waterloo is entered
			if(city.equals("Waterloo")) 
				break;
		}
		//Prints out coldest city
		System.out.println(coldestCity);
	}
}
