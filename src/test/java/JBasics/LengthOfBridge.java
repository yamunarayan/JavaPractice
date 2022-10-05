package JBasics;

public class LengthOfBridge {
    public static void main(String[] args){
        System.out.println("Length of the bridge is "+bridgeLength(30,18,120) );

    }
    public static double bridgeLength(double speed, double time,double length) {
        return((speed*time)-length);
    }
}
