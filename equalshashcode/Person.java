package equalshashcode;

public class Person {
    private String name;
    private Integer age;

    // Argument constructor
    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    // GETTERs and SETTERs
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    // Comment and uncomment the equals() and hashcode() methods to see the
    // difference on the results. Without these 2 methods, 2 different objects
    // with same attributes will be added into a hashset DS that should not
    // allow duplicates.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (name != null ? !name.equals(person.name) : person.name != null) return false;
        if (age != null ? !age.equals(person.age) : person.age != null) return false;

        return true;
    }

//    @Override
//    public int hashCode() {
//        int result = name != null ? name.hashCode() : 0;
//        result = 31 * result + (age != null ? age.hashCode() : 0);
//        return result;
//    }
}
