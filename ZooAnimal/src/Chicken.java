/**
 *
 * @author pandy
 */
public class Chicken extends Bird{
    
    public Chicken(int age, String gender, int weight){
        super(age, gender, weight);
    }
    
    @Override
    public void move(){
        System.out.println("Chicken is running...");
    }
}
