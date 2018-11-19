package management;

import staff.Employee;

public class Director extends Employee {

    private Double budget;

    public Director(String name, int niNumber, double salary, double budget) {
        super(name, niNumber, salary);
        this.budget = budget;
    }

    public Double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public Double payBonus(){
        return super.getSalary()*0.02;
    }


}
