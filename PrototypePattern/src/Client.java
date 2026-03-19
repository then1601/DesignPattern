
public class Client {
	public static void main(String[] args) {
        Person p1 = new Person("Thỏ");
        Rabbit r1 = new Rabbit(2, p1);

        Rabbit r2 = r1.clone();
        
        r1.showInfo();
        r2.showInfo();
    }
}
