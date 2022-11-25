package Bridge;

public class Rectangle implements Shape{
    public Color color;

    public Rectangle(Color color) {
        this.color=color;
    }

    @Override
    public void draw() {
        System.out.println("Shape-->Rectangle");
        color.paint();
    }
}
