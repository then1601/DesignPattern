public class RedBorderDecorator extends ShapeDecorator {
    public RedBorderDecorator(Component shape) {
        super(shape);
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        drawRedBorder();
    }

    private void drawRedBorder() {
        System.out.println("Adding a red border to the shape");
    }
}