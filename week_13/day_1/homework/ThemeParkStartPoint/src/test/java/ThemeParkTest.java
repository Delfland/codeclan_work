import attractions.Dodgems;
import attractions.RollerCoaster;
import org.junit.Before;
import org.junit.Test;
import people.Visitor;
import stalls.CandyflossStall;
import stalls.IceCreamStall;
import stalls.ParkingSpot;

import static org.junit.Assert.assertEquals;

public class ThemeParkTest {

    ThemePark themePark;
    CandyflossStall candyflossStall;
    IceCreamStall iceCreamStall;
    Dodgems dodgems;
    RollerCoaster rollercoaster;
    Visitor visitor;

    @Before
    public void before(){
        themePark = new ThemePark("Delph's Funfair");
        candyflossStall = new CandyflossStall("I Love Candy!", "James", ParkingSpot.A1, 5);
        iceCreamStall = new IceCreamStall("I Love Ice Cream", "Kelsie", ParkingSpot.A4, 2);
        dodgems = new Dodgems("Dodg'em All", 4);
        rollercoaster = new RollerCoaster("Void of Doom", 5);
        visitor = new Visitor(13, 150, 40);
    }

    @Test
    public void canAddAttractions(){
        themePark.addAttraction(dodgems);
        themePark.addAttraction(rollercoaster);
        assertEquals(2, themePark.getAttractions().size());
    }

    @Test
    public void canAddStalls(){
        themePark.addStall(candyflossStall);
        themePark.addStall(iceCreamStall);
        assertEquals(2, themePark.getStalls().size());
    }

    @Test
    public void canReturnAllReviewed(){
        themePark.addAttraction(dodgems);
        themePark.addAttraction(rollercoaster);
        themePark.addStall(candyflossStall);
        themePark.addStall(iceCreamStall);
        assertEquals(4, themePark.getAllReviewed().size());
    }

    @Test
    public void canLetAVisitorVisitAnAttraction(){
        themePark.visit(visitor, dodgems);
        assertEquals(1, visitor.getVisitedAttractions().size());
        assertEquals(1, dodgems.getVisitCount());
    }

}
