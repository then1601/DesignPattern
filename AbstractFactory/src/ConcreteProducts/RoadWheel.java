package ConcreteProducts;

import AbstractProducts.Wheel;

public class RoadWheel implements Wheel {
    public void manufacture() {
        System.out.println("Manufacturing Road Wheel");
    }
}
