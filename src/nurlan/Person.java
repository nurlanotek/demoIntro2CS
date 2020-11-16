package nurlan;

public class Person {
    private String firstName;
    private String email;
    private String password;

    public Person() {
    }

    public Person(String firstName) {
        this.firstName = firstName;
    }

    public Person(String firstName, String email) {
        this.firstName = firstName;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Person(String firstName, String email, String password) {
        this.firstName = firstName;
        this.email = email;
        this.password = password;
    }
}
