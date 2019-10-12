
import java.util.Random;

/**
 *
 * @author pandy
 */
public class Roll36 {
    public static void main(String[] args) {
        
        Random r = new Random();
        int face1;
        int face2;
        int[] totals = new int[13];
        
        for (int index = 0; index < totals.length; index++) {
            totals[index] = 0;
        }
        
        for (int roll = 0; roll <= 36000000; roll++) {
            face1 = 1 + r.nextInt(6);
            face2 = 1 + r.nextInt(6);
            totals[face1 + face2]++;
        }
        
        System.out.println("");
        
        for (int i = 0; i < totals.length; i++) {
            int percent = (totals[i]/36000000)*100 ;
            System.out.println("number" + i + " is " + totals[i] + " and percentage ratio is " + percent);
        }
    }
}
