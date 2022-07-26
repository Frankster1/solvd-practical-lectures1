package InheritancePOO;

public class Wife extends Human {

    //Constructor
    public Wife(String name, String lastName, int yearsOld) {
        super(name, lastName, yearsOld);
    }

    //Show Wife's data
    public void showData() {
        System.out.println("Name: " + getName() +
                "\nLast Name: " + getLastName() +
                "\nYears Old: " + getYearsOld());

    }
}
