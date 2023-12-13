public class Main {
    public static void main(String[] args) {
        Person person = new Person("Петров", "Петр");
        System.out.println(person.info());
        Employee employee = new Employee("Петров", "Петр",2300);
        System.out.println(employee.info());

    }
}