package gmail.nikmikhailov13.lesson29.figures;


public class Main {

    public static void main(String[] args) {
        Shape triangle = new Triangle(5, 5, 5);

        System.out.println(triangle.calculateArea());
        System.out.println(triangle.calculatePerimeter());

    }
}
