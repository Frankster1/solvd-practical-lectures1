package InheritancePOO;

public class Associate extends Human {
    public int yearsOfExperience;
    public double costPerHour;

    //Constructor
    public Associate(String name, String lastName, int yearsOld, double costPerHour) {
        super(name, lastName, yearsOld);
        this.yearsOfExperience = yearsOfExperience;
        this.costPerHour = costPerHour;
    }

    //Show Associate's data
    public void showData() {
        System.out.println("Name: " + getName() +
                "\nLast Name: " + getLastName() +
                "\nYears Old: " + getYearsOld() +
                "\nYears of Experience: " + yearsOfExperience +
                "\nCost per hour: " + costPerHour);
    }
}
