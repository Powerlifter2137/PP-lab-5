import company.beans.Person;

public class Main {
    public static void main(String[] args) {
        try {
            Person person = new Person("Tomek", 21);
            System.out.println("Name: " + person.getName());
            System.out.println("Age: " + person.getAge());
        } catch (Exception ex) {
            System.out.println(ex);
        }

        try {
            Person person = new Person("Piotr", 150);
            System.out.println("Name: " + person.getName());
            System.out.println("Age: " + person.getAge());
        } catch (Exception ex) {
            System.out.println(ex);
        }

    }
}