public class Person {
    String firstName;
    String lastName;

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String first) {
        this.firstName = first;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Person(String first, String last) {
        firstName = first;
        lastName = last;
    }

    public void doSomething() {
        System.out.println("I am watching Netflix");
    }

    @Override
    public String toString() {
        return this.firstName + " " + this.lastName;
    }
}













