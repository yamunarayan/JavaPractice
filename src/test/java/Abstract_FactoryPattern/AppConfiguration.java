package Abstract_FactoryPattern;

public class AppConfiguration {

    public static Application configure(String osName){
    Application app;
    UIFactory factory;
    if(osName.equalsIgnoreCase("Mac")){
        factory = new MacFactory();
        return new Application(factory);
        } else if (osName.equalsIgnoreCase("windows")) {
        factory= new WindowsFactory();
        return new Application(factory);
    }
        return null;
           }


           public static void main(String[] args){
            Application app= configure("windows");
               app.paint();
           }

}
