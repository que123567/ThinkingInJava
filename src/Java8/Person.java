package Java8;

public class Person {
    String First;
    String Second;

    public Person(String first, String second) {
        First = first;
        Second = second;
    }

    public Person() {
    }
}

interface PersonFactory<P extends Person> {
    P create(String firstName, String lastName);
}

interface PersonMockFactory<P extends Person> {
    P create();
}
