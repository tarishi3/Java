/**
 *
 * @author Tarishi pandya
 */
public class Zoo {
    public static void main(String[] args) {
        
        Bird b1 = new Bird();
        System.out.println("");
        moveAnimal(b1);
        
        Bird b2 = new Bird(10, "Female", 10);
        System.out.println("");
        b2.speak();
        
        Fish f1 = new Fish();
        System.out.println("");
        moveAnimal(f1);
        
        Chicken c1 = new Chicken(1, "Female", 10);
        System.out.println("");
        moveAnimal(c1);
        
        Sparrow s1 = new Sparrow();
        System.out.println("");
        moveAnimal(s1);
    }
    
    public static void moveAnimal(Animal animal){
        animal.move();
    }
}
