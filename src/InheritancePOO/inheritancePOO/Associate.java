package inheritancePOO;

public final class Associate extends Human {
    public int yearsOfExperience;
    public double costPerHour;


    //Constructor
    public Associate(String name, String lastName, int age, double costPerHour) {
        super(name, lastName, age);
        this.yearsOfExperience = yearsOfExperience;
        this.costPerHour = costPerHour;
    }
}
