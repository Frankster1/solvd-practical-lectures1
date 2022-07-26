package InheritancePOO;

public class FamilyLawyer extends Human {

    public int lawyersLicence;
    public double costPerHour;

    //Constructor
    public FamilyLawyer(String name, String lastName, int yearsOld, int lawyersLicence, double costPerHour) {
        super(name, lastName, yearsOld);

        this.lawyersLicence = lawyersLicence;
        this.costPerHour = costPerHour;
    }

    //Show Family laywer's data
    public void showData() {
        System.out.println("Name: " + getName() +
                "\nLast Name: " + getLastName() +
                "\nYears Old: " + getYearsOld() +
                "\nLicence number: " + lawyersLicence +
                "\nCost per hour: " + costPerHour);

    }
}
