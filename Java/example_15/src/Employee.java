public class Employee extends Person{


    private double salary;

    public Employee() {
        super(0,"default","default","default","default","default");
    }

    public Employee(int id, String firstName, String lastName, String phoneNumber, String dateOfBirth, String email, double salary) {
        super(id, firstName, lastName, phoneNumber, dateOfBirth, email);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "salary=" + salary +
                "} " + super.toString();
    }
}
