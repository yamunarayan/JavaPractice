package JBasics;

public class AreaOfTriangle {
    public static void main(String[] args){
        System.out.println("Area of Triangle is "+triangleArea(2,3,4));

    }

    public static double triangleArea(int a,int b, int c){
         if(a<0 | b<0 |c<0 |(a+b<=c) | (a+c<=b)|(b+c<=a)){
            System.out.println("Not a valid triangle");
            System.exit(0);
        }
           double side=a+b+c/2;
        double area = Math.sqrt(side*(side-a)*(side-b)*(side-c));
        return  area;
    }
}
