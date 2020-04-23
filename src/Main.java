import logic.Methods;

public class Main {
    public static void main(String[] args) {
        System.out.println("Użycie while");
        Methods.numberWithWhile(0.0,3.0,0.1, "0.0");
        System.out.println("\nUżycie do while");
        Methods.numberWithDoWhile(0.0,3.0,0.1, "0.0");
    }
}
