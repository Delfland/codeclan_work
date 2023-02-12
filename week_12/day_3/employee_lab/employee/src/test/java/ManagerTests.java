import org.junit.Before;
import org.junit.Test;
import staff.management.Manager;

import static org.junit.Assert.assertEquals;

public class ManagerTests {

    Manager manager;

    @Before
    public void before(){
        manager = new Manager("Thom Wall", "SC36276C", 50000, "Testing");
    }

    @Test
    public void managerHasAName(){
        assertEquals("Thom Wall", manager.getName());
    }

    @Test
    public void managerHasAnNiNumber(){
        assertEquals("SC36276C", manager.getNiNumber());
    }

    @Test
    public void managerHasASalary(){
        assertEquals(50000, manager.getSalary(), 0.0);
    }

    @Test
    public void managerHasADepartment(){
        assertEquals("Testing", manager.getDeptName());
    }

    @Test
    public void managerSalaryCanIncrease(){
        assertEquals(51500.00, manager.raiseSalary(1500.00), 0.0);
    }

    @Test
    public void managerSalaryCanGetABonus(){
        assertEquals(500.00, manager.payBonus(), 0.0);
    }



}
