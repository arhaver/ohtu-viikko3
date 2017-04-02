import java.util.*;
import ohtu.Multiplier;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Multiplier kolme = new Multiplier(2);
        System.out.println("anna luku ");
        int luku = scanner.nextInt();

        System.out.println("luku kertaa kaksi on "+kolme.multipliedBy(luku) );
    }
}