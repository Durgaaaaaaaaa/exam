import java.util.*;

public class Sumavg {
    public static void main(String args[]) {

        int sum = 0;
       
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        
        System.out.println("The sum of first 10 numbers is " + sum);
        System.out.println("The average of first 10 numbers is " + (sum /10));
    }
}

