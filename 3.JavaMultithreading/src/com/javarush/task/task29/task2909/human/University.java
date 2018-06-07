package com.javarush.task.task29.task2909.human;

import java.util.ArrayList;
import java.util.List;

public class University {
    private String name;
    private int age;
    private List<Student> students = new ArrayList<>();

    public University(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public Student getStudentWithAverageGrade(double avGrade) {
        for (Student st : students) {
            if (st.getAverageGrade() == avGrade) return st;
        }
        return null;
    }

    public Student getStudentWithMaxAverageGrade() {
        double max = students.get(0).getAverageGrade();
        for (Student st : students) {
            if (st.getAverageGrade() > max) max = st.getAverageGrade();
        }
        for (Student st : students) {
            if (st.getAverageGrade() == max) return st;
        }
        return null;
    }

    public Student getStudentWithMinAverageGrade() {
        double min = students.get(0).getAverageGrade();
        for (Student st : students) {
            if (st.getAverageGrade() < min) min = st.getAverageGrade();
        }
        for (Student st : students) {
            if (st.getAverageGrade() == min) return st;
        }
        return null;
    }

    public void expel(Student student) {
        students.remove(student);
    }

}