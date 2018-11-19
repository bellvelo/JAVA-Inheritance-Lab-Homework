import org.junit.Before;
import org.junit.Test;
import techstaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    private DatabaseAdmin databaseAdmin;

    @Before
    public void setUp() throws Exception {
        databaseAdmin = new DatabaseAdmin("Joe", 5555, 25000.00);
    }

    @Test
    public void canRaiseSalary() {
        databaseAdmin.raiseSalary(10000.00);
        assertEquals(35000.00, databaseAdmin.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus() {
        assertEquals(250.00, databaseAdmin.payBonus(), 0.01);
    }

    @Test
    public void cantChangeNameIfNull() {
        databaseAdmin.setName(null);
        assertEquals("Joe", databaseAdmin.getName());
    }

    @Test
    public void canChangeName() {
        databaseAdmin.setName("Dylan");
        assertEquals("Dylan", databaseAdmin.getName());
    }
}
