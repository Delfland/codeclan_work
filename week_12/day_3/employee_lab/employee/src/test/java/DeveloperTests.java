import org.junit.Before;
import org.junit.Test;
import staff.techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTests {

    Developer developer;

    @Before
    public void before(){
        developer = new Developer("Dave", "SC36527C", 30000);
    }

    @Test
    public void devHasAName(){
        assertEquals("Dave", developer.getName());
    }

    @Test
    public void devHasAnNiNumber(){
        assertEquals("SC36527C", developer.getNiNumber());
    }

    @Test
    public void devHasASalary(){
        assertEquals(30000, developer.getSalary(), 0.0);
    }

    @Test
    public void devSalaryCanIncrease(){
        assertEquals(31500.00, developer.raiseSalary(1500.00), 0.0);
    }

    @Test
    public void managerSalaryCanGetABonus(){
        assertEquals(300.00, developer.payBonus(), 0.0);
    }
}
