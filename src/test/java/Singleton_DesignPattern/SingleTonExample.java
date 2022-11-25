package Singleton_DesignPattern;

public class SingleTonExample {
//have a private constructor
    // have a private static member in a class
    //have a  public static method
    //early instantation
    //lazy instantation
{
    SingleTonExample singleTonExample1 = new SingleTonExample();
}
    private static SingleTonExample singleTonExample;
    private SingleTonExample(){

    }
    public static SingleTonExample getInstance(){
        if(singleTonExample==null){
            singleTonExample=  new SingleTonExample();
        }
    return singleTonExample;
    }
}
