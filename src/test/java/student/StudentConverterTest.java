package student;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import utils.Utils;

import java.util.List;

class StudentConverterTest {

    private final StudentConverter studentConverter = new StudentConverter();

    @Test
    void studentConverterHonorRollTest() {
        List<Student> students = List.of(
                Utils.createStudent(22, 95),
                Utils.createStudent(23, 99),
                Utils.createStudent(24, 91));

        Assertions.assertTrue(studentConverter.convertStudents(students).stream().allMatch(Student::isHonorRoll));
    }

    @Test
    void studentConverterExceptionalTest() {
        List<Student> students = List.of(
                Utils.createStudent(18, 95),
                Utils.createStudent(19, 99),
                Utils.createStudent(20, 91));

        Assertions.assertTrue(studentConverter.convertStudents(students).stream().allMatch(Student::isExceptional));
    }

    @Test
    void studentConverterPassedTrueTest() {
        List<Student> students = List.of(
                Utils.createStudent(18, 75),
                Utils.createStudent(19, 82),
                Utils.createStudent(20, 85),
                Utils.createStudent(19, 79));

        Assertions.assertTrue(studentConverter.convertStudents(students).stream().allMatch(Student::isPassed));
    }

    @Test
    void studentConverterPassedFalseTest() {
        List<Student> students = List.of(
                Utils.createStudent(18, 70),
                Utils.createStudent(19, 51),
                Utils.createStudent(20, 64),
                Utils.createStudent(19, 55));

        Assertions.assertFalse(studentConverter.convertStudents(students).stream().allMatch(Student::isPassed));
    }

    @Test
    void studentConverterEmptyList() {

        Assertions.assertTrue(studentConverter.convertStudents(List.of()).isEmpty());
    }

    @Test
    void studentConverterNullTest() {
        Assertions.assertThrows(NullPointerException.class,() -> studentConverter.convertStudents(null));
    }
}
