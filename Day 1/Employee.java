import java.util.Random;

public abstract class Employee{
    private String employeeId;
    private String fullName;
    private String firstName;
    private String middleName;
    private String lastName;
    private double baseSalary;
    private String department;

    public Employee(String fullName, double baseSalary, String department){

        this.fullName = formatName(fullName);
        this.baseSalary = baseSalary;
        this.department = department;

        parseName();

        this.employeeId = generateEmployeeID();
    }

    private String formatName(String name){

        String words[] = name.trim().split("\\s+");
        String formatted = "";

        for (String word: words){
            formatted += word.substring(0,1).toUpperCase()
                    + word.substring(1).toLowerCase()
                    + " ";

        }
        return formatted.trim();
    }

    private void parseName(){
        String[] parts = fullName.split("\\s+");

        firstName = parts[0];

        if (parts.length == 2){
            middleName = "";
            lastName = parts[1];
        } else if (parts.length >=3) {
            middleName = parts[1];
            lastName = parts[2];
        } else {
            middleName = "";
            lastName = "";
        }
    }

    protected String getInitials(){
        String initials = "";

        if (!firstName.isEmpty())
            initials += firstName.charAt(0);

        if (!lastName.isEmpty())
            initials += lastName.charAt(0);

        return initials.toUpperCase();
    }

    private String generateEmployeeID(){
        String role = getRole().toUpperCase();

        String prefix = "";

        if (role.contains("MANAGER"))
            prefix = "MAN";
        if (role.contains("DEVELOPER"))
            prefix = "DEV";
        if (role.contains("DESIGNER"))
            prefix = "DES";
        else
            prefix = "EMP";

        Random random = new Random();
        int number = random.nextInt(9000) + 1000;
        return prefix + "_" + getInitials() + "_" + number;
    }

    public String generatePayslip() {
        return "------------------------------\n"
                + "Employee ID: " + employeeId + "\n"
                + "Name       : " + fullName + "\n"
                + "Role       : " + getRole() + "\n"
                + "Department : " + department+ "\n"
                + "Base Salary: " + baseSalary+ "\n"
                + "Bonus      : " + getBonus() + "\n"
                + "Net Salary : " + calculateSalary() + "\n"
                + "-----------------------------";
    }

    //Abstract Methods
    public abstract double calculateSalary();
    public abstract String getRole();
    public abstract double getBonus();

    //Getters
    public String getEmployeeId(){
        return employeeId;
    }

    public String getFullName(){
        return fullName;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public double getBaseSalary(){
        return baseSalary;
    }

    public String getDepartment(){
        return department;
    }

    //Setters
    public void setFullName(String fullName){
        if (fullName != null && !fullName.trim().isEmpty())
            this.fullName = formatName(fullName);
    }

    public void setBaseSalary(double baseSalary){
        if (baseSalary >= 0)
            this.baseSalary = baseSalary;
    }

    public void setDepartment(String department){
        if (department != null && !department.trim().isEmpty())
            this.department =  department;
    }
}
