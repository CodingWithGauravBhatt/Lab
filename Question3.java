package Today6Apr;
import java.io.*;

class Person implements Serializable {
    private String name;
    private transient int age; // Mark age as transient to exclude it from serialization

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
}

public class Question3 {

    public static void main(String[] args) {
        Person person = new Person("John Doe", 30);

        try {
            FileOutputStream fileOutputStream = new FileOutputStream("person.ser");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

            // Write object to file
            objectOutputStream.writeObject(person);

            objectOutputStream.close();
            fileOutputStream.close();

            System.out.println("Person object has been serialized.");

            FileInputStream fileInputStream = new FileInputStream("person.ser");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

            // Read object from file
            Person deserializedPerson = (Person) objectInputStream.readObject();

            objectInputStream.close();
            fileInputStream.close();

            System.out.println("Deserialized person object:");
            System.out.println("Name: " + deserializedPerson.getName());
            System.out.println("Age: " + deserializedPerson.getAge()); // Age will be 0 since it was marked as transient
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
