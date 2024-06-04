import java.util.HashSet;
import java.util.Set;


// Practice using sets in Java


public class SetPractice {


    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("Kangning");
        set.add("Aakash");
        set.add("Jubal");
        set.add("Jiazou");
        

        //System.out.println(set); // Jubal, Aakash, Jiazou, Kangning
                

        set.add("Alice"); // will not add because Alice already exists in the set

        System.out.println(set.contains("Alice")); // false


        // TODO: add Set<Person>, and see
        // how it behaves with both students and person.
        // Make sure to have a duplicate student or person


        Set<Person> set_Persons = new HashSet<>();
        
        
        Person e1 = new Student("Alice", 1);
        Person e2 = new Student("Alice", 1);

        Person e3 = new Person("Alice");
        Person e4 = new Person("Alice");
        
        set_Persons.add(e1);
        set_Persons.add(e2);
        set_Persons.add(e3);
        set_Persons.add(e4);

        System.out.println(set_Persons); // []
        // System.out.println("CONTAINS OR NOT");
        // System.out.println(set_Persons.contains(e1)); // 
        // System.out.println(set_Persons.contains(e2)); // 
        // System.out.println(set_Persons.contains(e3)); // 
        // System.out.println(set_Persons.contains(e4)); // 
        //System.out.println(set_Persons); // []

    }

}
