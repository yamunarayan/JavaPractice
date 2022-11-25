package Decorator;

public abstract class ShapeDecorator implements Shape{

    public Shape shapeDecorator;

    public ShapeDecorator(Shape shapeDecorator){
        this.shapeDecorator=shapeDecorator;
    }
}
