package BugHunters;

public class Employee extends Person {

    double salary;

    Employee(String name, int age, String gender, double salary) {
        super(name, age, gender);
        this.salary = salary;
    }
    public double getSalary(){
        return salary;
    }

public boolean isSameName(Employee employee){

        return this.getName().equals(employee.getName());

}


}
