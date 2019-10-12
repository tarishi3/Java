/**
 *
 * @author Tarishi pandya
 */
public class Human {
    
    int age;
    int heightInCm;
    String name;
    String eyeColor;
    
    public Human(){
        
    }
    
    public Human(int age, int height, String name, String eyeColor){
        this.age = age;
        this.heightInCm = height;
        this.name = name;
        this.eyeColor = eyeColor;
    }
    
    public void eat(){
        System.out.println(name + " is eating...");
    }
    
    public void sleep(){
        System.out.println(name + " is sleeping...");
    }
    
    public void speak(){
        System.out.println("Hello my name is: " + name);
        System.out.println("My eye color is: " + eyeColor);
        System.out.println("My height in cm is: " + heightInCm);
        System.out.println("My age is: " + age);
    }
}
