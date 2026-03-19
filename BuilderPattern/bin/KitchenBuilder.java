public class KitchenBuilder implements RoomBuilder {
    private Kitchen kitchen;

    public KitchenBuilder() {
        reset();
    }

    @Override
    public void reset() {
        kitchen = new Kitchen();
    }

    @Override
    public void buildStructure() {
        kitchen.setStoveCount(1);
    }

    @Override
    public void buildUtilities() {
        kitchen.setHasFridge(true);
    }

    public KitchenBuilder setStoveCount(int count) {
        kitchen.setStoveCount(count);
        return this;
    }

    public KitchenBuilder setHasFridge(boolean val) {
        kitchen.setHasFridge(val);
        return this;
    }

    @Override
    public Kitchen build() {
        return kitchen;
    }
}
