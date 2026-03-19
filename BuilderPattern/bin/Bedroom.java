public class Bedroom extends Room {
    int bedCount;
    boolean hasTV;
    boolean hasAC;
    double area;
    String wallColor;
    boolean hasBalcony;
    int windowCount;
    String floorMaterial;

    @Override
    public String toString() {
        return "Bedroom [beds=" + bedCount +
                ", TV=" + hasTV +
                ", AC=" + hasAC +
                ", area=" + area +
                ", wallColor=" + wallColor +
                ", balcony=" + hasBalcony +
                ", windows=" + windowCount +
                ", floor=" + floorMaterial + "]";
    }

    @Override
    public String getType() {
        return "Bedroom - beds: " + bedCount + ", wallColor: " + wallColor;
    }
}
