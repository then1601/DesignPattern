package ConcreteFactory;

import AbstractFactory.BikeFactory;
import AbstractProducts.Wheel;
import AbstractProducts.Frame;
import ConcreteProducts.MountainWheel;
import ConcreteProducts.MountainFrame;

public class MountainBikeFactory implements BikeFactory {

    public Wheel createWheel() {
        return new MountainWheel();
    }

    public Frame createFrame() {
        return new MountainFrame();
    }
}
