package BugHunters;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Tanya", 30, "F", 28000);
        Employee employee2 = new Employee("Dasha", 28, "F", 38700);
        System.out.println(employee1.isSameName(employee2));
        System.out.println(employee1.getName());
        System.out.println(employee2.getName());
        System.out.println(Salary.getSum(new Employee[]{employee1, employee2}));

    }
}
