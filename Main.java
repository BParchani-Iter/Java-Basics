import java.util.List;

public class Main {
    public static void main(String args[]){

        PayrollSystem payrollSystem = new PayrollSystem("TechCorp");

        Manager manager = new Manager(
                "anushka ankush ahuja",
                70000,
                "Management",
                10);

        manager.setProjectBonus(10000);

        Developer developer = new Developer(
                "shraeyaa nilesh bhosale",
                40000,
                "IT",
                "Java",
                "Mid"
        );

        developer.completeProject();
        developer.completeProject(4);

        Designer designer = new Designer(
                "neil nitin mukesh",
                25000,
                "Design",
                "Figma",
                "UI/UX"
        );

        designer.completeDesign();
        designer.completeDesign(2);
        designer.completeDesign("Website Redesign", 3);

        payrollSystem.addEmployee(manager);
        payrollSystem.addEmployee(designer);
        payrollSystem.addEmployee(developer);


        System.out.println("==== Encapsulation ====");
        System.out.println(manager.getFullName());
        manager.setDepartment("Corporate Management");
        System.out.println(manager.getDepartment());

        System.out.println("\n==== Inheritance ====");
        System.out.println(manager.getRole());
        System.out.println(developer.getRole());
        System.out.println(designer.getRole());

        System.out.println("\n==== Polymorphism ====");
        Employee e1 = manager;
        Employee e2 = developer;
        Employee e3 = designer;

        System.out.println(e1.calculateSalary());
        System.out.println(e2.calculateSalary());
        System.out.println(e3.calculateSalary());

        System.out.println("\n==== Abstraction ====");

        Employee[] employees = {manager, developer, designer};
        for (Employee e : employees) {
            System.out.println(e.generatePayslip());
        }

        System.out.println("\n==== String Manipulation ====");

        System.out.println("Manager ID: " + manager.getEmployeeId());
        System.out.println("Developer Email: " + developer.generateEmail());
        System.out.println("Portfolio: " + designer.generatePortfolioURL());
        System.out.println("Signature: " + designer.createSignature());

        payrollSystem.displayAllEmployees();

        System.out.println("\n==== Search By Name ====");

        List<Employee> nameSearch = payrollSystem.searchByName("anushka");
        for (Employee e: nameSearch){
            System.out.println(e.getFullName());
        }

        System.out.println("\n==== Search By Role ====");

        List<Employee> roleSearch = payrollSystem.searchByRole("Designer");
        for (Employee e: roleSearch){
            System.out.println(e.getFullName());
        }

        System.out.println("\n==== Total Payroll ====");
        System.out.println("$" + payrollSystem.calculateTotalPayroll());

        payrollSystem.generateSummaryReport();

    }
}