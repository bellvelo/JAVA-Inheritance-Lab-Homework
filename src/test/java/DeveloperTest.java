import org.junit.Before;
import org.junit.Test;
import techstaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {
    
    Developer developer;

    @Before
    public void setUp() throws Exception {
        developer = new Developer("David", 2222, 40000.00);
    }

    @Test
    public void canRaiseSalary() {
        developer.raiseSalary(10000.00);
        assertEquals(50000.00, developer.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus() {
        assertEquals(400.00, developer.payBonus(), 0.01);
    }

    @Test
    public void cantChangeNameIfNull() {
        developer.setName(null);
        assertEquals("David", developer.getName());
    }

    @Test
    public void canChangeName() {
        developer.setName("Dylan");
        assertEquals("Dylan", developer.getName());
    }
}
