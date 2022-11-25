package Builder_Design_Pattern;

public class Builder {
    public static void main(String[] args) {

        HouseBuildPlanner modernHouse = new ModernHouse();
        HouseBuildPlanner tailedRoofHouse = new TailedRoof();
        Engineer engineer = new Engineer(modernHouse);
        engineer.ConstructHome();

        House house = engineer.getHouse();
        System.out.println(house);
    }

}
