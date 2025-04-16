package gmail.nikmikhailov13.lesson40.inheritance;

public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer();
        Scanner scanner = new Scanner();
        Fax fax = new Fax();

        printer.print("Germany, please don't use fax");
        scanner.scan("der Ausweis");
        fax.send("I cry");
        fax.sendWithEmoji("skjdfg", "sdf");

        MultifunctionalMachine mfm = new MultifunctionalMachine();

        mfm.print("Germany, please don't use fax");
        mfm.scan("der Ausweis");
        mfm.send("I cry");
        mfm.sendWithEmoji("skjdfg", "sdf");
    }
}
