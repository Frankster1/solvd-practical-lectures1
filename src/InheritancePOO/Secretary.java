package InheritancePOO;

public class Secretary extends Human {
    public int yearsOfExperience;
    public double costPerHour;

    //Constructor
    public Secretary(String name, String lastName, int yearsOld, int yearsOfExperience, double costPerHour) {
        super(name, lastName, yearsOld);

        this.yearsOfExperience = yearsOfExperience;
        this.costPerHour = costPerHour;
    }

    //Shows Secretary data
    public void showData() {
        System.out.println("Name: " + getName() +
                "\nLast Name: " + getLastName() +
                "\nYears Old: " + getYearsOld() +
                "\nYears of Experience: " + yearsOfExperience +
                "\nCost per hour: " + costPerHour);
    }
}
