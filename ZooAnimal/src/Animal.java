/**
 *
 * @author Tarishi pandya
 */
public abstract class Animal {
    
    int age;
    String gender;
    int weight;
    
    public Animal(){
        
    }
    
    public Animal(int age, String gender, int weight){
        this.age = age;
        this.gender = gender;
        this.weight = weight;
    }
    
    public Animal(int age, int weight){
        this.age = age;
        this.weight = weight;
    }
    
    public void eat(){
        System.out.println("Animal is eating...");
    }
    
    public void sleep(){
        System.out.println("Animal is sleeping...");
    }
    
    public void speak(){
        System.out.println("My age is: " + age);
        System.out.println("My Gender is: " + gender);
        System.out.println("My Weight is: " + weight);
    }
    
    public abstract void move();
}
