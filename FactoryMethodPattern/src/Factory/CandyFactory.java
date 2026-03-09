package Factory;

import Candy.Candy;
public abstract class CandyFactory {
	public void orderCandy() {
        Candy candy = createCandy();
        System.out.println("Ordered: " + candy.getCandyName());
    }

    protected abstract Candy createCandy();
}
