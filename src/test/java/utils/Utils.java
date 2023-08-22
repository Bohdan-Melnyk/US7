package utils;

import player.Player;
import student.Student;

import java.util.List;

public class Utils {

    public static Student createStudent(int age, int grade) {
        Student student = new Student();

        student.setAge(age);
        student.setGrade(grade);

        return student;
    }

    public static Player createPlayer(int age, int experience, List<Integer> skills) {
        Player player = new Player();

        player.setAge(age);
        player.setExperience(experience);
        player.setSkills(skills);
        return player;
    }
}
