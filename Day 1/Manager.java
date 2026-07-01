public class Manager extends Employee{

    private int teamSize;
    private double projectBonus;

    public Manager (String fullName, double baseSalary, String department, int teamSize){
        super(fullName, baseSalary, department);
        this.teamSize = teamSize;
        this.projectBonus = 0;
    }

    public void setProjectBonus(double bonus){
        this.projectBonus = projectBonus;
    }

    public void setProjectBonus(String bonus){
        this.projectBonus = Double.parseDouble(bonus);
    }

    @Override
    public double calculateSalary(){
        return getBaseSalary()
                +(getBaseSalary() * 0.20)
                + projectBonus
                + getBonus();
    }

    @Override
    public String getRole(){
        return "Manager";
    }

    @Override
    public double getBonus(){
        return teamSize * 500;
    }

    public int getTeamSize(){
        return teamSize;
    }

    public void setTeamSize(int teamSize){
        if (teamSize >= 0)
            this.teamSize = teamSize;
}

public double getProjectBonus(){
    return projectBonus;
    }
}
