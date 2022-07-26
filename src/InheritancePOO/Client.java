package InheritancePOO;

import java.util.Scanner;

public class Client extends Human {
    public boolean isHeDivorcing = false;
    public boolean didHeCommitedCrime = false;
    String divorce;
    String crime;

    static Scanner sc = new Scanner(System.in);


    //Constructor
    public Client(String name, String lastName, int yearsOld, boolean isHeDivorcing, boolean didHeCommitedCrime, String divorce, String crime) {
        super(name, lastName, yearsOld);
        this.isHeDivorcing = isHeDivorcing;
        this.didHeCommitedCrime = didHeCommitedCrime;
        this.divorce = divorce;
        this.crime = crime;
    }

    //Show Client's data
    public static void askClient() {
        System.out.println("Please enter your name: ");
        String name = sc.nextLine();

        System.out.println("Please enter your last name: ");
        String lastName = sc.nextLine();

        System.out.println("Please enter your age: ");
        int yearsOld = sc.nextInt();

        System.out.println("Please enter Y if you are divorcing, otherwise enter N: ");
        String divorce = sc.next();

        System.out.println("Please enter Y if you commited a crime, otherwise enter N: ");
        String crime = sc.nextLine();
    }

    public boolean divorcing(String divorce, boolean isHeDivorcing) {
        if (divorce == "Y") {
            isHeDivorcing = true;
        } else {
            isHeDivorcing = false;
        }
        return isHeDivorcing;
    }

    public boolean crimeCommitment(String crime, boolean didHeCommitedCrime) {
        if (crime == "Y") {
            didHeCommitedCrime = true;
        } else {
            didHeCommitedCrime = false;
        }
        return didHeCommitedCrime;
    }
}
