package gmail.nikmikhailov13.lesson40;

public class Main {
    public static void main(String[] args) {
        Operationable<String> operationable =
                (x,  y) -> x + y;

        String result = operationable.calculate("123", "456");

        System.out.println(result);
    }
}
