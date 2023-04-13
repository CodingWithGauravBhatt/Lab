package Today13Apr;
import java.util.ArrayList;

public class Person {
    private String name;
    private int age;
    
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    public static void main(String[] args) {
        ArrayList<Person> personList = new ArrayList<>();
        personList.add(new Person("Aman", 30));
        personList.add(new Person("John", 25));
        personList.add(new Person("Nitin", 42));
        personList.add(new Person("Saurav", 18));
        personList.add(new Person("Gaurav", 56));
        personList.add(new Person("tushar", 29));
        personList.add(new Person("Mukul", 37));
        personList.add(new Person("OM", 21));
        personList.add(new Person("Tarun", 45));
        personList.add(new Person("Karan", 31));
        
        for (Person person : personList) {
            System.out.println("Name: " + person.getName() + ", Age: " + person.getAge());
        }
    }
}
