package Bridge;

public class BridgeDemo {

    public static void main(String[] args){
        Rectangle rectangle = new Rectangle(new Orange());
        rectangle.draw();

        Triangle triangle = new Triangle(new Blue());
        triangle.draw();
    }

}
