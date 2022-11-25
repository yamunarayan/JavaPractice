package Decorator;

public class DecoratorDemo {

    public static void main(String[] args){
        Shape circle = new Circle();
        Shape rectangle = new Rectangle();
        System.out.println("These are shapes with normal borders ");
        circle.draw();
        rectangle.draw();

        System.out.println("This is a circle with red line as a border");
        RedDecoratorShape redDecoratorShape = new RedDecoratorShape(circle);
        redDecoratorShape.draw();

        System.out.println("This is a rectangle with red line as a border");
         redDecoratorShape = new RedDecoratorShape(rectangle);
         redDecoratorShape.draw();
    }
}
