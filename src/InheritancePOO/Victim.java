package InheritancePOO;

import java.util.Scanner;

public class Victim extends Human {
    Scanner sc = new Scanner(System.in);

    //Constructor
    public Victim(String name, String lastName, int yearsOld) {
        super(name, lastName, yearsOld);
    }

    public void askForVictimsData() {
        System.out.println("Please enter the victim's name: ");
        String name = sc.nextLine();

        System.out.println("Please enter the victim's last name: ");
        String lastName = sc.nextLine();

        System.out.println("Please enter the victim's age: ");
        int yearsOld = sc.nextInt();
    }
}
