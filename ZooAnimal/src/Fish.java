/**
 *
 * @author Tarishi pandya
 */
public class Fish extends Animal{
    
    public Fish(){
    
    }
    
    public Fish(int age, String gender, int weight){
        super(age, gender, weight);
    }
   
    @Override
    public void speak(){
        System.out.println("Fish age is: " + age);
        System.out.println("Fish Gender is: " + gender);
        System.out.println("Fish Weight is: " + weight);
    }
    
     @Override
    public void move(){
         System.out.println("Fish is swimming...");
    }
}
