
public class Rabbit {
	private int age;
    private Person owner;

    public Rabbit(int age, Person owner) {
        this.age = age;
        this.owner = owner;
    }

    @Override
    public Rabbit clone() {
        Person clonedOwner = new Person(this.owner);
        return new Rabbit(this.age, clonedOwner);
    }

    public void showInfo() {
        System.out.println("Age: " + age + ", Owner: " + owner.getName());
    }

}
