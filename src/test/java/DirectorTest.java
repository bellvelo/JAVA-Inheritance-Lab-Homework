import management.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void setUp() throws Exception {
        director = new Director("Jim", 3333, 75000.00, 1000000.00);
    }

    @Test
    public void canGetBudget() {
        assertEquals(1000000.00, director.getBudget(), 0.01);
    }

    @Test
    public void canSetSalary() {
        director.setSalary(80000.00);
        assertEquals(80000.00, director.getSalary(), 0.01);
    }

    @Test
    public void canSetBudget() {
        director.setBudget(2000000.00);
        assertEquals(2000000.00, director.getBudget(), 0.01);
    }

    @Test
    public void canRaiseSalary() {
        director.raiseSalary(10000.00);
        assertEquals(85000.00, director.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus() {
        assertEquals(1500.00, director.payBonus(), 0.01);
    }

    @Test
    public void cantChangeNameIfNull() {
        director.setName(null);
        assertEquals("Jim", director.getName());
    }
}
