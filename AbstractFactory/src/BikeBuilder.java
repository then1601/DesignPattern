import AbstractFactory.BikeFactory;
import AbstractProducts.Wheel;
import AbstractProducts.Frame;
import ConcreteFactory.MountainBikeFactory;
import ConcreteFactory.RoadBikeFactory;

public class BikeBuilder {

    public static void main(String[] args) {

        BikeFactory factory;

        System.out.println("=== Mountain Bike ===");
        factory = new MountainBikeFactory();

        Wheel mWheel = factory.createWheel();
        Frame mFrame = factory.createFrame();

        mWheel.manufacture();
        mFrame.manufacture();


        System.out.println("\n=== Road Bike ===");
        factory = new RoadBikeFactory();

        Wheel rWheel = factory.createWheel();
        Frame rFrame = factory.createFrame();

        rWheel.manufacture();
        rFrame.manufacture();
    }
}
