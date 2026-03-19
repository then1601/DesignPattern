
public class BedroomBuilder {
	private Bedroom bedroom;

    public BedroomBuilder() {
        reset();
    }

    public void reset() {
        bedroom = new Bedroom();
    }

    public void buildStructure() {
        bedroom.area = 20.0;
    }

    public void buildUtilities() {
        bedroom.hasAC = true;
    }

    public BedroomBuilder setBedCount(int count) {
        bedroom.bedCount = count;
        return this;
    }

    public BedroomBuilder setWallColor(String color) {
        bedroom.wallColor = color;
        return this;
    }

    public BedroomBuilder setArea(double area) {
        bedroom.area = area;
        return this;
    }

    public BedroomBuilder setHasTV(boolean val) {
        bedroom.hasTV = val;
        return this;
    }

    public BedroomBuilder setHasAC(boolean val) {
        bedroom.hasAC = val;
        return this;
    }

    public BedroomBuilder setHasBalcony(boolean val) {
        bedroom.hasBalcony = val;
        return this;
    }

    public BedroomBuilder setWindowCount(int count) {
        bedroom.windowCount = count;
        return this;
    }

    public BedroomBuilder setFloorMaterial(String material) {
        bedroom.floorMaterial = material;
        return this;
    }

    public Bedroom build() {
        return bedroom;
    }
}
