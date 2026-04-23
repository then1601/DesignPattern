public class ImageFile implements DisplayObject {
    private String path;

    public ImageFile(String path) {
        this.path = path;
        load();
    }

    private void load() {
        System.out.println("Loading image from: " + path);
    }

    @Override
    public void display() {
        System.out.println("Displaying image: " + path);
    }
}