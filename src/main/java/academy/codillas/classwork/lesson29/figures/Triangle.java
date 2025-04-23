package academy.codillas.classwork.lesson29.figures;

public class Triangle extends Shape {
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(double sideB, double sideA, double sideC) {
        this.sideB = sideB;
        this.sideA = sideA;
        this.sideC = sideC;
    }

    @Override
    double calculateArea() {
        double p = calculatePerimeter() / 2; // напівпериметр
        return Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC)); // формула Герона
    }

    @Override
    double calculatePerimeter() {
        return sideA + sideB + sideC;
    }

}

