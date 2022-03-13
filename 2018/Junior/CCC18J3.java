import java.util.*;

public class TestinLand {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        //Takes integer values for the 4 different cities
        int c1 = sc.nextInt();
        int c2 = sc.nextInt();
        int c3 = sc.nextInt();
        int c4 = sc.nextInt();
        sc.close();
        
        //Finds distance between cities
        int c1c2 = c1 + c2;
        int c1c2c3 = c1 + c2 + c3;
        int c1c2c3c4 = c1 + c2 + c3 + c4;
        
        //Prints out the different distances between cities
        System.out.println("0 " + c1 + " " + c1c2 + " " + c1c2c3 + " " + c1c2c3c4);
        System.out.println(c1 + " " + (c1 - c1) + " " + (c1c2 - c1) + " " + (c1c2c3 - c1) + " " + (c1c2c3c4 - c1));
        System.out.println(c1c2 + " " + (Math.abs(c1 - c1c2)) + " " + (Math.abs(c1c2 - c1c2)) + " " + (Math.abs(c1c2c3 - c1c2)) + " " + (Math.abs(c1c2c3c4 - c1c2)));
        System.out.println(c1c2c3 + " " + (Math.abs(c1 - c1c2c3)) + " " + (Math.abs(c1c2 - c1c2c3)) + " " + (Math.abs(c1c2c3 - c1c2c3)) + " " + (Math.abs(c1c2c3c4 - c1c2c3)));
        System.out.println(c1c2c3c4 + " " + (Math.abs(c1 - c1c2c3c4)) + " " + (Math.abs(c1c2 - c1c2c3c4)) + " " + (Math.abs(c1c2c3 - c1c2c3c4)) + " " + (Math.abs(c1c2c3c4 - c1c2c3c4)));
    }
}
