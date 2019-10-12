
import java.util.Scanner;


/**
 *
 * @author pandy
 */
public class Array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int[][] t = new int[2][3];
        
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[i].length; j++) {
                t[i][j] = 0;
            }
        }
        
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[i].length; j++) {
                System.out.println("Enter the index [" + i + "][" + j + "]: ");
                t[i][j] = input.nextInt();
            }
        }
        
        System.out.println("");
        
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[i].length; j++) {
                System.out.println(t[i][j]);
            }
        }
    }
}
