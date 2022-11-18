package Builder_Design_Pattern;

public class Engineer {
    public HouseBuildPlanner houseBuildPlanner;

    public Engineer(HouseBuildPlanner houseBuildPlanner){
        this.houseBuildPlanner=houseBuildPlanner;
    }

    public void ConstructHome(){
        this.houseBuildPlanner.buildBasement();
        this.houseBuildPlanner.buildRoof();
        this.houseBuildPlanner.buildInterior();

    }

    public House getHouse(){
        return this.houseBuildPlanner.getHouse();
    }

}
