/**
 *
 * @author Tarishi pandya
 */
public class Bird extends Animal{
    
    public Bird(){
    
    }
    
    public Bird(int age, String gender, int weight){
        super(age, gender, weight);
    }
    
    @Override
    public void speak(){
        System.out.println("Bird age is: " + age);
        System.out.println("Bird Gender is: " + gender);
        System.out.println("Bird Weight is: " + weight);
    }
    
    @Override
    public void move(){
        System.out.println("Bird is flapping wings");
    }
}
