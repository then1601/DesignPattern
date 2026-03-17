package ConcreteFactory;

import AbstractFactory.BikeFactory;
import AbstractProducts.Wheel;
import AbstractProducts.Frame;
import ConcreteProducts.RoadWheel;
import ConcreteProducts.RoadFrame;

public class RoadBikeFactory implements BikeFactory {

    public Wheel createWheel() {
        return new RoadWheel();
    }

    public Frame createFrame() {
        return new RoadFrame();
    }
}
