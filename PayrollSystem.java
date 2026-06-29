import java.util.ArrayList;
import java.util.List;

public class PayrollSystem {
    private List<Employee> employees;
    private String companyName;

    public PayrollSystem(String companyName){
        this.companyName = companyName;
        employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee){
        employees.add(employee);
    }

    public void removeEmployee(String id){
        Employee employeeToRem = null;

        for (Employee employee : employees){
            if (employee.getEmployeeId().equalsIgnoreCase(id)){
                employeeToRem = employee;
                break;
            }
        }

        if (employeeToRem != null){
            employees.remove(employeeToRem);
        }
    }

    //search by name
    public List<Employee> searchByName(String name){

        List<Employee> result = new ArrayList<>();

        for (Employee employee : employees){
            if (employee.getFullName().toLowerCase().contains(name.toLowerCase())){
                result.add(employee);
            }
        }
        return result;
    }

    //search by role
    public List<Employee> searchByRole(String role){
        List<Employee> result = new ArrayList<>();

        for (Employee employee : employees){
            if (employee.getRole().toLowerCase().contains(role.toLowerCase())){
                result.add(employee);
            }
        }
        return result;
    }

    public double calculateTotalPayroll(){
        double total = 0;

        for (Employee employee: employees){
            total += employee.calculateSalary();
        }
        return total;
    }

    public void displayAllEmployees(){
        System.out.println("\n======" + companyName + "Employees =====");

        for (Employee employee : employees){
            System.out.println(employee.generatePayslip());
        }
    }

    //summary report
    public void generateSummaryReport(){
        int managers = 0;
        int developers = 0;
        int designers = 0;

        for (Employee employee : employees){
            String role = employee.getRole().toLowerCase();

            if (role.contains("manager"))
                managers++;
            else if (role.contains("developer"))
                developers++;
            else if (role.contains("designer"))
                designers++;
        }

        System.out.println("\n==== Summary Report ====");
        System.out.println("Company :" + companyName);
        System.out.println("Managers :" + managers);
        System.out.println("Developers :" + developers);
        System.out.println("Designers :" + designers);
        System.out.println("Total Employees :" + employees.size());
        System.out.println("Total Payroll : $" + calculateTotalPayroll());
    }

    public List<Employee> getEmployees(){
        return employees;
    }

    public String getCompanyName(){
        return companyName;
    }

    public void setCompanyName(String companyName){
        this.companyName = companyName;
    }
}

