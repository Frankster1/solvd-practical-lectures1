package inheritancePOO;

public final class Client extends Human {
    private static boolean isDivorcing;
    private static boolean needsCriminalLawyer;
    private static String problemToSolve;
    private static boolean isVictim;


    //Constructor
    public Client(String name, String lastName, int age) {
        super(name, lastName, age);
        this.isDivorcing = false;
        this.needsCriminalLawyer = false;
    }

    public static boolean isIsDivorcing() {
        return isDivorcing;
    }

    public static boolean isNeedsCriminalLawyer() {
        return needsCriminalLawyer;
    }

    public static void setIsVictim(boolean isVictim) {
        Client.isVictim = isVictim;
    }

    public static String getProblemToSolve() {
        return problemToSolve;
    }

    public static void setProblemToSolve(String problemToSolve) {
        Client.problemToSolve = problemToSolve;
    }
}
