import company.beans.Person;
import company.exceptions.InvalidAgeException;
import company.implementations.EmailMessenger;
import company.utils.MathUtils;

public class Main {
    public static void main(String[] args) {
        Person[] people = new Person[5];
        final int b = 10;

        try {
            people[0] = new Person("John Doe", 30);
            people[1] = new Person("John Paul", 67);
            people[2] = new Person("Boby Shmurda", 17);
            people[3] = new Person("Kevin Spacey", 36);
            people[4] = new Person("Michael Jordan", 22);
        } catch (InvalidAgeException e) {
            System.out.println("Incorrect age: " + e.getMessage());
        }

        EmailMessenger emailMessenger = new EmailMessenger();

        for (Person person : people) {
            if (person != null) {
                int value = MathUtils.add(person.getAge(), b);
                emailMessenger.sendMessage(person.getName() + " value is: " + value);
            }
        }
    }
}