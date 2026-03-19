
class Kitchen extends Room {
    private int stoveCount;
    private boolean hasFridge;

    public void setStoveCount(int stoveCount) {
        this.stoveCount = stoveCount;
    }

    public void setHasFridge(boolean hasFridge) {
        this.hasFridge = hasFridge;
    }

    @Override
    public String getType() {
        return "Kitchen - Stove: " + stoveCount + ", Fridge: " + hasFridge;
    }
}