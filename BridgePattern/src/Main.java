public class Main {
    public static void main(String[] args) {
        // Tạo một hình tròn màu đỏ
        Shape redCircle = new Circle(new Red());
        redCircle.draw();

        // Tạo một hình tam giác màu xanh dương
        Shape blueTriangle = new Triangle(new Blue());
        blueTriangle.draw();

        // Tạo một hình tròn màu xanh lá
        Shape greenCircle = new Circle(new Green());
        greenCircle.draw();
        
        // Tạo một hình tam giác màu đỏ
        Shape redTriangle = new Triangle(new Red());
        redTriangle.draw();
    }
}
