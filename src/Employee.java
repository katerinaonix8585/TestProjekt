public class Employee extends Person{

    public int salary;

    public Employee(String firstName, String lastName, int salary) {
        super(firstName, lastName);
        this.salary = salary;
    }

    @Override
    public String info() {
        return String.format("%s (%d)", super.info(), this.salary);
    }
}
