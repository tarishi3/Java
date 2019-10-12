/**
 *
 * @author pandy
 */
public class TestStatic {
    public static void main(String[] args) {
        int age = 12;
        age = 15;
        System.out.println("value of age is " + age);
        doWorkMother();
        //doWorkChild();
    }
    
    public static void doWorkMother(){
        int inside = 31;
        System.out.println("I am inside doWorkMother and value of inside is " + inside);
        doWorkChild();
    }
    
    public static void doWorkChild(){
        System.out.println("I am inside doWorkChild");
    }
}


