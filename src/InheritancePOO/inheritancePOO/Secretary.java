package inheritancePOO;

import java.util.Scanner;

public final class Secretary extends Human implements Work {
    public int yearsOfExperience;
    public double costPerHour;

    Scanner sc = new Scanner(System.in);

    //Constructor
    public Secretary(String name, String lastName, int age, int yearsOfExperience, double costPerHour) {
        super(name, lastName, age);

        this.yearsOfExperience = yearsOfExperience;
        this.costPerHour = costPerHour;
    }

    public Client registerClient() {
        //Menu
        System.out.println("Welcome to the C & J Law Firm!");
        System.out.println("Please enter your name: ");
        String name = sc.nextLine();
        System.out.println("Please enter your last name: ");
        String lastName = sc.nextLine();
        System.out.println("Please enter your age: ");
        int age = sc.nextInt();

        return new Client(name, lastName, age);
    }


    @Override
    public void doDailyWork() {

    }

    @Override
    public double paperWorkHours(int hours) {
        return 0;
    }

}
