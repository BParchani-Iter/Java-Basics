public class Designer extends Employee{
    private String designTool;
    private int designsCompleted;
    private String specialization;

    public Designer(String fullName, double baseSalary, String department, String designTool, String specialization){
        super(fullName, baseSalary, department);
        this.designsCompleted = 0;
        this.designTool = designTool;
        this.specialization = specialization;
    }

    @Override
    public double calculateSalary(){
        double creativityAllowance = getBaseSalary() * 0.15;

        return getBaseSalary()
                + creativityAllowance
                + getBonus();
    }

    @Override
    public String getRole(){
        return specialization + "DESIGNER";
    }

    @Override
    public double getBonus(){
        return designsCompleted * 250;
    }

    public void completeDesign(){
        designsCompleted++;
    }

    public void completeDesign(int count){
        designsCompleted += count;
    }

    public void completeDesign(String projectName, int count){
        System.out.println("Completed Project: " +projectName);
        designsCompleted += count;
    }

    public String generatePortfolioURL(){
        return "https://portfolio.techcorp.com/"
                + getFirstName().toLowerCase()
                + getLastName().toLowerCase();
    }

    public String createSignature(){
        return "✎"
                + getInitials()
                + " | "
                + designTool
                + " | "
                + specialization;
    }

    public String getDesignTool(){
        return designTool;
    }

    public void setDesignTool(String designTool){
        this.designTool = designTool;
    }

    public int getDesignsCompleted(){
        return designsCompleted;
    }

    public void getDesignsCompleted(int designsCompleted){
        if (designsCompleted >= 0)
            this.designsCompleted = designsCompleted;
    }

    public String getSpecialization(){
        return specialization;
    }

    public void setSpecialization(String specialization){
        this.specialization = specialization;
    }

}