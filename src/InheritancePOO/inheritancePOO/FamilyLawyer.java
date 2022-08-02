package inheritancePOO;

public final class FamilyLawyer extends Lawyer {

    //Constructor
    public FamilyLawyer(String name, String lastName, int age, int lawyersLicence, double costPerHour, int clientsPerDay) {
        super(name, lastName, age, lawyersLicence, costPerHour, clientsPerDay);
    }

    @Override
    public double generateBudget(int hours) {
        return hours * getCostPerHour() + 150;
    }
}
