package Decorator;

public class RedDecoratorShape extends ShapeDecorator{
    public RedDecoratorShape(Shape shapeDecorator) {
        super(shapeDecorator);
    }

    @Override
    public void draw() {
        shapeDecorator.draw();
        decorate();
    }

    public void decorate(){
        System.out.println("This is red line border");
    }
}
