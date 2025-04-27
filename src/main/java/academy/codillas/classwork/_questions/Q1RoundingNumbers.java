package academy.codillas.classwork._questions;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Q1RoundingNumbers {
    public static void main(String[] args) {
        // Якщо ми просто хочемо красиво вивести double без фактичного округлення чисел
        // ми можемо використовувати printf або DecimalFormat для гарного виведення чисел
        // із заданою кількістю знаків після коми.
        prettyPrintNumber(Math.PI);
        prettyPrintNumber(Math.PI, 5);
        prettyPrintNumberV2(Math.PI, 5);

        System.out.println(Math.round(26077.5d));


        // Працює погано через помилки точності (10^3 * 10^17 = 10^20 (тобто 100,000,000,000,000,000,000),
        // АЛЕ Java повертає 9,223,372,036,854,775,807)

        System.out.println("Number: " + roundNumberBad(1000.0d, 17));
        // ВИВОДИТЬ: 92.23372036854776

        System.out.println("Number: " + roundNumberBad(260.775d, 2));
        // ВИВОДИТЬ: 260.77 замість очікуваного 260.78

        // Працює правильно!
        System.out.println("Number: " + roundNumberGood(1000.0d, 17));
        System.out.println("Number: " + roundNumberGood(260.775d, 2));

        /*
        Ці неочікувані результати виникають через те, що примітивні типи, такі як float і double,
        використовують бінарне представлення, яке не може точно відобразити деякі десяткові значення.
        Внаслідок цього округлення з цими типами може призводити до тонких помилок усічення або округлення.
        Наприклад, значення 260.775 не може бути точно представлене як double.
        Внутрішньо воно може зберігатися як трохи менше за 260.775, тому округлення до двох десяткових знаків
        дає 260.77 замість очікуваного 260.78.

        Ці неточності виникають через спосіб зберігання чисел із плаваючою комою в пам'яті.
        Значення з плаваючою комою зберігаються як комбінація мантиси та експоненти,
        що дозволяє їм представляти широкий діапазон чисел, але за рахунок точності.
        Це робить float і double швидкими, але ненадійними для точних значень,
        таких як валюти, де критична точність.
         */
    }

    // ======== ПРОСТЕ ВИВЕДЕННЯ ЧИСЕЛ БЕЗ ФАКТИЧНОГО ОКРУГЛЕННЯ

    public static void prettyPrintNumber(double number) {
        System.out.printf("Number: %.2f%n", number);
    }

    public static void prettyPrintNumber(double number, int decimalPlaces) {
        if (decimalPlaces < 0) {
            throw new IllegalArgumentException("Не можна округлити число до < 0 знаків після коми!");
        }

        String formatSpecifier = "%." + decimalPlaces + "f";
        System.out.printf("Number: " + formatSpecifier + "%n", number);
    }

    public static void prettyPrintNumberV2(double number, int decimalPlaces) {
        if (decimalPlaces < 0) {
            throw new IllegalArgumentException("Не можна округлити число до < 0 знаків після коми!");
        }

        DecimalFormat decimalFormat = new DecimalFormat();
        decimalFormat.setMaximumFractionDigits(decimalPlaces);
        System.out.printf("Number: %s%n", decimalFormat.format(number));
    }

    // ======== ФАКТИЧНЕ ОКРУГЛЕННЯ ЧИСЕЛ

    public static double roundNumberBad(double number, int decimalPlaces) {
        if (decimalPlaces < 0) {
            throw new IllegalArgumentException("Не можна округлити число до < 0 знаків після коми!");
        }
        double scale = Math.pow(10, decimalPlaces);

        long rounded = Math.round(number * scale);

        double result = rounded / scale; // Math.round(number * scale) / scale

        System.out.printf(
                "COMPUTING => Math.round(%f * %f) / %f = %d / %f = %."+ decimalPlaces +"f%n",
                number, scale, scale,
                rounded, scale,
                result
        );

        return result;
    }

    public static double roundNumberGood(double number, int decimalPlaces) {
        if (decimalPlaces < 0) {
            throw new IllegalArgumentException("Не можна округлити число до < 0 знаків після коми!");
        }

        BigDecimal bigDecimal = new BigDecimal(Double.toString(number));
        bigDecimal = bigDecimal.setScale(decimalPlaces, RoundingMode.HALF_UP);

        return bigDecimal.doubleValue();
    }
}