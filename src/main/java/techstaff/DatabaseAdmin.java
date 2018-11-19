package techstaff;

import org.junit.Before;
import org.junit.Test;
import staff.Employee;

import static org.junit.Assert.assertEquals;

public class DatabaseAdmin extends Employee {

    public DatabaseAdmin(String name, int niNumber, double salary) {
        super(name, niNumber, salary);
    }
}
