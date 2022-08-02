package inheritancePOO;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Creating the Law Firm
        LawFirm lawFirm = new LawFirm();

        //Adding Lawyers, Secretearies, Clients and Associates to the firm
        CriminalLawyer lawyer1 = new CriminalLawyer("Francisco", "Caride", 23, 0001, 30.25, 5);
        lawFirm.addLawyer(lawyer1);
        FamilyLawyer lawyer2 = new FamilyLawyer("Steve", "Jobs", 23, 0002, 20.25, 8);
        lawFirm.addLawyer(lawyer2);
        Secretary secretary1 = new Secretary("Rocio", "Navarro", 22, 1, 10.25);
        lawFirm.addSecretary(secretary1);
        Associate associate1 = new Associate("Selena", "Gomez", 30, 5.20);
        lawFirm.addAssociate(associate1);
        Client client1 = secretary1.registerClient();
        lawFirm.addClient(client1);


    }

}



