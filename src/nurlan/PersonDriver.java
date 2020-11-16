package nurlan;

public class PersonDriver {
    public static void main(String[] args) {
        Person person = new Person("nurlan", "nurlan@gmail.kg", "qwerty");
        System.out.println(person);
        System.out.println(person.getFirstName());
        System.out.println(person.getEmail());
        System.out.println(person.getPassword());
    }
}
