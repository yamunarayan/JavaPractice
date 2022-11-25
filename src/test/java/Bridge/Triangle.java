package Bridge;

public class Triangle implements Shape{
    public Color color;

    public Triangle(Color color) {
        this.color=color;
    }

    @Override
    public void draw() {
        System.out.println("Shape-->Triangle");
        color.paint();
    }
}
