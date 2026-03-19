public class BedroomBuilder implements RoomBuilder {
    private Bedroom bedroom;

    public BedroomBuilder() {
        reset();
    }

    @Override
    public void reset() {
        bedroom = new Bedroom();
    }

    @Override
    public void buildStructure() {
        bedroom.area = 20.0;
    }

    @Override
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

    @Override
    public Bedroom build() {
        return bedroom;
    }
}
