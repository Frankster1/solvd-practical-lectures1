package InheritancePOO;

public class CriminalLawyer extends Human {

    public int lawyersLicence;
    public double costPerHour;

    //Constructor
    public CriminalLawyer(String name, String lastName, int yearsOld, int lawyersLicence, double costPerHour) {
        super(name, lastName, yearsOld);

        this.lawyersLicence = lawyersLicence;
        this.costPerHour = costPerHour;
    }

    //Show Criminal defense lawyer's data
    public void showData() {
        System.out.println("Name: " + getName() +
                "\nLast Name: " + getLastName() +
                "\nYears Old: " + getYearsOld() +
                "\nLicence number: " + lawyersLicence +
                "\nCost per hour: " + costPerHour);

    }
}
