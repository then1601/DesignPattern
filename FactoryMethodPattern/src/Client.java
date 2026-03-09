import Factory.CandyFactory;
import Factory.ChocolateFactory;
import Factory.MintFactory;

public class Client {

    public static void main(String[] args) {

        CandyFactory chocolateFactory = new ChocolateFactory();
        chocolateFactory.orderCandy();

        CandyFactory mintFactory = new MintFactory();
        mintFactory.orderCandy();
    }
}