public abstract class ShapeDecorator implements Component {
    protected Component decoratedShape;

    public ShapeDecorator(Component shape) {
        this.decoratedShape = shape;
    }

    @Override
    public void draw() {
        decoratedShape.draw();
    }
}