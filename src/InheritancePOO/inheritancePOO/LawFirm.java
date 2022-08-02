package inheritancePOO;

import java.util.ArrayList;

public class LawFirm {
    ArrayList lawyers;
    ArrayList clients;
    ArrayList secretaries;
    ArrayList associates;

    public LawFirm() {
        this.lawyers = new ArrayList();
        this.clients = new ArrayList();
        this.secretaries = new ArrayList();
        this.associates = new ArrayList();
    }

    public void addLawyer(Lawyer lawyer) {
        lawyers.add(lawyer);
    }

    public void addSecretary(Secretary secretary) {
        secretaries.add(secretary);
    }

    public void addAssociate(Associate associate) {
        associates.add(associate);
    }

    public void addClient(Client client) {
        clients.add(client);
    }
}

