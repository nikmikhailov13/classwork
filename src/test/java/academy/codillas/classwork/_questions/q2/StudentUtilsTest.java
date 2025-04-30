package academy.codillas.classwork._questions.q2;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StudentUtilsTest {

    private static final Student STUDENT_OLEH = new Student("Oleh", 19, 3.3);
    private static final Student STUDENT_TARAS = new Student("Taras", 20, 4.6);
    private static final Student STUDENT_ROMAN = new Student("Roman", 18, 4.1);
    private static final Student STUDENT_NAZAR = new Student("Nazar", 21, 3.6);
    private static final Student STUDENT_ANNA = new Student("Anna", 22, 4.4);
    private static final Student STUDENT_OLHA = new Student("Olha", 18, 3.9);

    private static final List<Student> STUDENTS = List.of(
            STUDENT_OLEH,
            STUDENT_TARAS,
            STUDENT_ROMAN,
            STUDENT_NAZAR,
            STUDENT_ANNA,
            STUDENT_OLHA
    );

    @Test
    void getStudentsWithLowGrade() {
        // given STUDENTS (constant)
        List<Student> expectedStudentsWithLowGrade = List.of(
                STUDENT_OLEH,
                STUDENT_NAZAR,
                STUDENT_OLHA
        );

        // when
        List<Student> studentsWithLowGrade = StudentUtils.getStudentsWithLowGrade(STUDENTS);

        // then
        assertEquals(expectedStudentsWithLowGrade.size(), studentsWithLowGrade.size());
        assertTrue(studentsWithLowGrade.containsAll(expectedStudentsWithLowGrade));
    }

    @Test
    void getStudentsWithHighGrade() {
        // TODO
    }

    @Test
    void getStudentWithHighestGrade() {
        // TODO
    }

    @Test
    void isAnyStudentWithGrade5Exists() {
        // TODO
    }

    @Test
    void getNumberOfStudentsOlderThan20YearsOld() {
        // TODO
    }

    @Test
    void sortByGradeDescending() {
        // TODO
    }
}