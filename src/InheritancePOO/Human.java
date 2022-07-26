package InheritancePOO;

public class Human {
    private String name;
    private String lastName;
    private int yearsOld;

    public Human(String name, String lastName, int yearsOld) {
        this.name = name;
        this.lastName = lastName;
        this.yearsOld = yearsOld;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getYearsOld() {
        return yearsOld;
    }
}
