public class Developer extends Employee {
    private String programmingLang;
    private int projectsCompleted;
    private String skillLevel;

    public Developer(String fullName, double baseSalary, String department, String programmingLang, String skillLevel){
        super(fullName, baseSalary, department);
        this.programmingLang = programmingLang;
        this.skillLevel = skillLevel;
        this.projectsCompleted = 0;
    }

    @Override
    public double calculateSalary() {
        double allowance = 0;
        if (skillLevel.equalsIgnoreCase("Senior")) {
            allowance = getBaseSalary() * 0.25;
        } else if (skillLevel.equalsIgnoreCase("Mid")) {
            allowance = getBaseSalary() * 0.15;
        } else {
            allowance = getBaseSalary() * 0.05;
        }
        return getBaseSalary() + allowance + getBonus();
    }

    @Override
    public String getRole(){
        return skillLevel + " DEVELOPER";
    }

    @Override
    public double getBonus(){
        return projectsCompleted * 300;
    }

    public void completeProject(){
        projectsCompleted++;
    }

    public void completeProject(int count){
        projectsCompleted += count;
    }

    public String generateEmail(){
        return getFirstName().substring(0,1).toLowerCase()
                + "."
                + getLastName().toLowerCase()
                + "@techcorp.com";
    }

    public String getProgrammingLang(){
        return programmingLang;
    }

    public void setProgrammingLang(String programmingLang){
        this.programmingLang = programmingLang;
    }

    public int getProjectsCompleted(){
        return projectsCompleted;
    }

    public void setProjectsCompleted(int projectsCompleted){
        if (projectsCompleted >= 0)
            this.projectsCompleted = projectsCompleted;
    }

    public String getSkillLevel(){
        return skillLevel;
    }

    public void setSkillLevel(String skillLevel){
        this.skillLevel = skillLevel;
    }
}