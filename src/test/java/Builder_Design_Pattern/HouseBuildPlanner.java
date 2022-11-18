package Builder_Design_Pattern;

public interface HouseBuildPlanner {
    public void buildBasement();

    public void buildRoof();
    public void buildInterior();

    public House getHouse();

    // return the house object

}
