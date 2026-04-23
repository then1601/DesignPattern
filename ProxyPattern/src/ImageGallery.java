public class ImageGallery {
    public static void main(String[] args) {
        DisplayObject img1 = new ImageProxy("vacation.jpg");
        DisplayObject img2 = new ImageProxy("wedding.png");
        DisplayObject img3 = new ImageProxy("graduation.gif");

        System.out.println("=== Images created but not yet loaded ===");
        
        System.out.println("\n=== Displaying img1 for the first time ===");
        img1.display(); // Loads and displays
        
        System.out.println("\n=== Displaying img1 again ===");
        img1.display(); // Displays without re-loading
        
        System.out.println("\n=== Displaying img2 for the first time ===");
        img2.display(); // Loads and displays

    }
}