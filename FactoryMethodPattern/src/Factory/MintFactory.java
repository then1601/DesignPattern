package Factory;
import Candy.Candy;
import Candy.MintCandy;
public class MintFactory extends CandyFactory {

    @Override
    protected Candy createCandy() {
        return new MintCandy();
    }
}