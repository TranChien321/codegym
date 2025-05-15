package Lesson_5.Employee;

public class TestEmployee {
    public static void main(String[] args) {
        Employee emp1 = new Employee(1, "Nguyen Van A", "Sales Manager", 1200.0, "2023-01-15", "Sales");
        emp1.raiseSalary(10);
        emp1.displayInfo();

        System.out.println("\nBonus (15%): $" + emp1.calculateBonus(15));

        System.out.println("\n---");

        Employee emp2 = new Employee("Le Thi B", "Staff");
        emp2.setId(2);
        emp2.setSalary(800);
        emp2.setHireDate("2024-05-10");
        emp2.setDepartment("HR");
        emp2.displayInfo();
    }
}

