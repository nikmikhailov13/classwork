package gmail.nikmikhailov13.lesson16;

import gmail.nikmikhailov13.lesson16.animals.Cat;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Now you can create a cat");
        System.out.println("Please enter the name of your cat");

        String name = scanner.nextLine();
        System.out.println("Please enter the age of your cat");
        int age = scanner.nextInt();
        System.out.println("Please enter the weight of your cat");
        double weight = scanner.nextDouble();

        Cat cat = new Cat(name, age, weight);
        System.out.println("The cat was successfully created");
        System.out.println(cat);

        scanner.close();

    }
}
