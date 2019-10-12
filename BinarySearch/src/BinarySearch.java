
import java.util.Arrays;

/**
 *
 * @author tarishipandya
 */

public class BinarySearch {
    
    public static void main(String[] args) {
        
        int[] array = {78,4,14,15,58,45,79};
        Arrays.sort(array);
        System.out.println(binary_search(array, 58));
        
    }
    
    public static int binary_search(int[] array, int x){
        
        int first = 0;
        int last = array.length -1;

        while (first <= last){
            int mid = (first+last)/2;
            if(array[mid] == x){ 
                return mid;
            } else if (array[mid] > x){
                last = mid - 1;
                
            } else if (array[mid] < x){
                first = mid +1;
                
            }
           
        }
        return -1;
    }
}
