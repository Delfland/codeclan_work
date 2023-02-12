import org.junit.Before;
import org.junit.Test;
import staff.management.Director;

import static org.junit.Assert.assertEquals;

public class DirectorTests {

    Director director;

    @Before
    public void before(){
        director = new Director("Thom Wall", "SC36276C", 80000, "Testing", 42000000.00);
    }

    @Test
    public void directorHasAName(){
        assertEquals("Thom Wall", director.getName());
    }

    @Test
    public void directorHasAnNiNumber(){
        assertEquals("SC36276C", director.getNiNumber());
    }

    @Test
    public void directorHasASalary(){
        assertEquals(80000, director.getSalary(), 0.0);
    }

    @Test
    public void directorHasADepartment(){
        assertEquals("Testing", director.getDeptName());
    }

    @Test
    public void directorSalaryCanIncrease(){
        assertEquals(81500.00, director.raiseSalary(1500.00), 0.0);
    }

    @Test
    public void directorSalaryCanGetABonus(){
        assertEquals(800.00, director.payBonus(), 0.0);
    }

    @Test
    public void directorHasABudget(){
        assertEquals(42000000.00, director.getBudget(), 0.0);
    }
}
