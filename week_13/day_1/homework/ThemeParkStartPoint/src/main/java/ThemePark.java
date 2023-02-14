import attractions.Attraction;
import behaviours.IReviewed;
import people.Visitor;
import stalls.Stall;
import java.util.ArrayList;


public class ThemePark {

    String name;
    ArrayList<Stall> stalls;
    ArrayList<Attraction> attractions;

    public ThemePark(String name) {
        this.name = name;
        this.stalls = new ArrayList<>();
        this.attractions = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Stall> getStalls() {
        return stalls;
    }

    public void setStalls(ArrayList<Stall> stalls) {
        this.stalls = stalls;
    }

    public ArrayList<Attraction> getAttractions() {
        return attractions;
    }

    public void setAttractions(ArrayList<Attraction> attractions) {
        this.attractions = attractions;
    }

    public void addAttraction(Attraction attraction) {
        attractions.add(attraction);
    }

    public void addStall(Stall stall) {
        stalls.add(stall);
    }

    public ArrayList<IReviewed> getAllReviewed() {
        ArrayList<IReviewed> allReviewed = new ArrayList<>();
        allReviewed.addAll(attractions);
        allReviewed.addAll(stalls);
        return allReviewed;
    }

    public void visit(Visitor visitor, Attraction attraction) {
        visitor.addAttraction(attraction);
        attraction.incrementVisitCount();
    }
}
