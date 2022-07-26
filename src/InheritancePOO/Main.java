package InheritancePOO;

public class Main {
    public static void main(String[] args) {

        Lawyer lawyer = new Lawyer("Francisco", "Caride", 23, 0001, 10);
        lawyer.showData();

        Associate associate = new Associate("Pedro", "Gomez", 20, 3.50);
        associate.showData();

        Secretary secretary = new Secretary("Marta", "Rodriguez", 40, 3, 3.50);
        secretary.showData();

        Partner partner = new Partner("Tomas", "Martinez", 50, 0002, 200);
        partner.showData();

        CriminalLawyer criminalLawyer = new CriminalLawyer("Gaston", "Caride", 21, 0003, 15.25);
        criminalLawyer.showData();

        FamilyLawyer familyLawyer = new FamilyLawyer("Santiago", "Caride", 22, 0003, 12.50);
        familyLawyer.showData();

        Client.askClient();
    }
}



