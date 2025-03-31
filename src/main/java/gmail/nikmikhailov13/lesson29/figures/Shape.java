package gmail.nikmikhailov13.lesson29.figures;

abstract class Shape {
    // Абстрактний метод для обчислення площі
    abstract double calculateArea();

    // Абстрактний метод для обчислення периметра
    abstract double calculatePerimeter();

    // Метод для виведення інформації про фігуру
    void displayInfo() {
        System.out.println("Площа: " + calculateArea());
        System.out.println("Периметр: " + calculatePerimeter());
    }
}
