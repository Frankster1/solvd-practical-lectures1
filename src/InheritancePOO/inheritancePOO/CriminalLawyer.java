package inheritancePOO;

import java.util.Scanner;

public final class CriminalLawyer extends Lawyer implements IWork {

    Scanner sc = new Scanner(System.in);


    //Constructor
    public CriminalLawyer(String name, String lastName, int age, int lawyersLicence, double costPerHour, int clientsPerDay) {
        super(name, lastName, age, lawyersLicence, costPerHour, clientsPerDay);
    }

    @Override
    public double generateBudget(int hours) {

        return hours * getCostPerHour() + 300;
    }

    public void serveClient(Client client) {
        System.out.println("Please describe the problem: ");
        String problemDescription = sc.nextLine();
        Client.setProblemToSolve(problemDescription);

        System.out.println("If you are the Victim insert 1, if you are the criminal insert 2: ");
        int option = sc.nextInt();
        if (option == 1) Client.setIsVictim(true);
        else Client.setIsVictim(false);

    }

    //TODO
    @Override
    public void doDailyWork() {
        for (int i = 0; i < getClientsPerDay(); i++) {
            serveClient();
        }
    }

    @Override
    public double paperWorkHours(int hours) {
        if (Client.isNeedsCriminalLawyer())
            generateBudget(300);
        return hours * getCostPerHour() * 300;
    }
}
