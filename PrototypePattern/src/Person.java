
public class Person {
	private String name;

    public Person(String name) {
        this.name = name;
    }

    public Person(Person p) {
        this.name = p.name;
    }

    public String getName() {
        return name;
    }
}
