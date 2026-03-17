package AbstractFactory;

import AbstractProducts.Frame;
import AbstractProducts.Wheel;

public interface BikeFactory {
    Wheel createWheel();
    Frame createFrame();
}
