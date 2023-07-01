package equalshashcode;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        // Create a HashSet DS
        Set<Person> personSet = new HashSet<>();

        // Two different objects but with same attribute values
        Person person1 = new Person("Aman", 20);
        Person person2 = new Person("Aman", 20);

        // Add objects to HashSet that should not allows duplicates
        personSet.add(person1);
        personSet.add(person2);

        // Person class with equals() and hashcode()    - output: 1
        // Person class without equals() and hashcode() - output: 2
        System.out.println(personSet.size());
    }
}
