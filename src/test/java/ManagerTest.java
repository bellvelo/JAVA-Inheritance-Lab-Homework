import management.Manager;
import staff.Employee;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;


    @Before
    public void Before(){
        manager = new Manager("Bob", 1234, 50000.00, "Database");
    }

    @Test
    public void canGetName() {
        assertEquals("Bob", manager.getName());
    }

    @Test
    public void canGetNiNumber() {
        assertEquals(1234, manager.getNiNumber());
    }

    @Test
    public void canGetSalary() {
        assertEquals(50000.00, manager.getSalary(), 0.01);
    }

    @Test
    public void canSetSalary() {
        manager.setSalary(60000.00);
        assertEquals(60000.00, manager.getSalary(), 0.01);
    }

    @Test
    public void canGetDeptName() {
        assertEquals("Database", manager.getDeptName());
    }

    @Test
    public void canSetDeptName() {
        manager.setDeptName("Testing");
        assertEquals("Testing", manager.getDeptName());
    }

    @Test
    public void canRaiseSalary() {
        manager.raiseSalary(10000.00);
        assertEquals(60000.00, manager.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus() {
        assertEquals(500.00, manager.payBonus(), 0.01);
    }

    @Test
    public void cantChangeNameIfNull() {
        manager.setName(null);
        assertEquals("Bob", manager.getName());
    }
}
