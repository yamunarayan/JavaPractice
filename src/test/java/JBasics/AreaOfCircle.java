package JBasics;

public class AreaOfCircle {
    public static final double PI=Math.PI;
    public static void main(String[] args){
    System.out.println("Area is "+ circleArea(4));
    }

    public static double circleArea(double a){
        return PI*Math.pow(a,2);
    }
}
