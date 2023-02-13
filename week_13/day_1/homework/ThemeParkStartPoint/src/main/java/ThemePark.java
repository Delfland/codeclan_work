import attractions.Attraction;
import attractions.Dodgems;
import behaviours.IReviewed;
import people.Visitor;
import stalls.CandyflossStall;
import stalls.Stall;

import java.util.ArrayList;
import java.util.Collection;

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
        for (IReviewed attraction : attractions) {
            allReviewed.add(attraction);
        }
        for (IReviewed stall : stalls) {
            allReviewed.add(stall);
        }
        return allReviewed;
    }

//    public void visit(Visitor visitor, Attraction attraction) {
//        visitor.addAttraction(attraction);
//        int visitCount = attraction.getVisitCount();
//        visitCount++;
//    }
}
