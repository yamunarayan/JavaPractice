package JBasics;

public class MultiplyBy2 {
    public static void main(String[] args){
System.out.println("number "+mul(5));
       mul1(5);
    }
    public static int mul(int n){
        int value,rem=n%10;

        switch(rem){
            case 0:
                value=0;
                break;
            case 5:
                value=1;
                break;

            default:
                value=-1;

        }
        return value;

    }
public static void mul1(int n){
      if(n%10==0)  {
          System.out.println(0);
      } else {
          n=n*2;
          if(n%10==0){
              System.out.println(1);
          }
          else{
              System.out.println(-1);
          }
          
      }
}

}
