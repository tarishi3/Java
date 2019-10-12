/**
 *
 * @author pandy
 */
public class Sparrow extends Bird{
    
    public Sparrow(){
    
    }
    
    public Sparrow(int age, String gender, int weight){
        super(age, gender, weight);
    }
    
    @Override
    public void move(){
        System.out.println("Sparrow is flying");
    }
}
