package Factory;
import Candy.Candy;
import Candy.ChocolateCandy;
public class ChocolateFactory extends CandyFactory {

    @Override
    protected Candy createCandy() {
        return new ChocolateCandy();
    }
}