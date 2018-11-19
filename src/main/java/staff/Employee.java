package staff;

public abstract class Employee {

    private String name;
    private int niNumber;
    private Double salary;

    public Employee(String name, int niNumber, Double salary) {
        this.name = name;
        this.niNumber = niNumber;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null) {
            this.name = name;
        }
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getNiNumber() {
        return niNumber;
    }

    public Double getSalary() {
        return salary;
    }

    public void raiseSalary(double raise) {
        if (raise > 0) {
            this.salary += raise;
        }
    }

    public Double payBonus(){
        return this.salary*0.01;
    }
}
