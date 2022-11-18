package Builder_Design_Pattern;

public class TailedRoof implements HouseBuildPlanner{

    private House house;
    @Override
    public void buildBasement() {
        this.house.setBasement("This is tailedRoof basement");
    }

    @Override
    public void buildRoof() {
        this.house.setRoof("This is tailedRoof roof");
    }

    @Override
    public void buildInterior() {
        this.house.setInterior("This is tailedRoof interior");
    }

    @Override
    public House getHouse() {
        return this.house;
    }
}
