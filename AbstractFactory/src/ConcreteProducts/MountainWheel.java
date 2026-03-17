package ConcreteProducts;

import AbstractProducts.Wheel;

public class MountainWheel implements Wheel {
    public void manufacture() {
        System.out.println("Manufacturing Mountain Wheel");
    }
}
