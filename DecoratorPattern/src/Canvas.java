public class Canvas {
    public static void main(String[] args) {
        Component circle = new Circle();
        
        System.out.println("=== Normal Circle ===");
        circle.draw();
        
        System.out.println("\n=== Circle with Red Border ===");
        Component redBorderCircle = new RedBorderDecorator(new Circle());
        redBorderCircle.draw();
        
        System.out.println("\n=== Multiple Decorators (Nested Red Border) ===");
        Component doubleRedBorderCircle = new RedBorderDecorator(new RedBorderDecorator(new Circle()));
        doubleRedBorderCircle.draw();
    }
}