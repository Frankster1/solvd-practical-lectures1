package inheritancePOO;

public abstract class Lawyer extends Human {
    private int lawyersLicence;
    private double costPerHour;
    private int clientsPerDay;


    //Constructor
    public Lawyer(String name, String lastName, int age, int lawyersLicence, double costPerHour, int clientsPerDay) {
        super(name, lastName, age);
        this.lawyersLicence = lawyersLicence;
        this.costPerHour = costPerHour;
        this.clientsPerDay = clientsPerDay;
    }

    //Methods
    public int getLawyersLicence() {
        return lawyersLicence;
    }

    public int getClientsPerDay() {
        return clientsPerDay;
    }

    public double getCostPerHour() {
        return costPerHour;
    }

    public abstract double generateBudget(int hours);

}
