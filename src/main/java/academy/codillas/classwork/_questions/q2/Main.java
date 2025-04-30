package academy.codillas.classwork._questions.q2;

import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        List<Student> students = List.of(
                new Student("Oleh", 19, 3.3),
                new Student("Taras", 20, 4.6),
                new Student("Roman", 18, 4.1),
                new Student("Nazar", 21, 3.6),
                new Student("Anna", 22, 4.4),
                new Student("Olha", 18, 3.9)
        );

        List<Student> studentsWithLowGrades = StudentUtils.getStudentsWithLowGrade(students);
        System.out.println("1. Студенти з оцінкою менше 4.0: " + studentsWithLowGrades);
        System.out.println();

        Optional<Student> highestGrade = StudentUtils.getStudentWithHighestGrade(students);
        System.out.println("2. Найкращий студент: " + highestGrade);
        System.out.println();

        long olderThan20 = StudentUtils.getNumberOfStudentsOlderThan20YearsOld(students);
        System.out.println("3. Студенти, які старші за 20 років: " + olderThan20);
        System.out.println();

        List<Student> sortedStudents = StudentUtils.sortByGradeDescending(students);
        System.out.println("4. Імена студентів за спаданням оцінки: " + sortedStudents);
        System.out.println();

        boolean hasGradeFive = StudentUtils.isAnyStudentWithGrade5Exists(students);
        System.out.println("5. Чи є студент з оцінкою 5.0 ?: " + hasGradeFive);
        System.out.println();

        List<Student> studentsWithHighGrade = StudentUtils.getStudentsWithHighGrade(students);
        System.out.println("6. Студенти з оцінкою > 4.0: " + studentsWithHighGrade);
    }
}
