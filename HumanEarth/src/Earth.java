/**
 *
 * @author Tarishi pandya
 */
public class Earth {
    public static void main(String[] args) {
        
        Human human1 = new Human();
        human1.age = 25;
        human1.heightInCm = 170;
        human1.name = "Rishabh";
        human1.eyeColor = "Black";
        human1.eat();
        human1.sleep();
        System.out.println("");
        human1.speak();
        
        Human human2 = new Human(23, 166, "Sudip", "Brown");
        System.out.println("");
        human2.speak();
        
    }
}
