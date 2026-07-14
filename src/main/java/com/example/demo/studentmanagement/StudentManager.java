package com.example.demo.studentmanagement;

import java.util.*;

public class StudentManager{
    private int score;
    private final List<Student> students = new ArrayList<>();
    private final Map<String, Integer> studentScore = new HashMap<>();
    private final Set<String> studentCheck = new HashSet<>();

    public void addStudent(Student student, int score) {
        if (studentCheck.contains(student.getName())){
            System.out.println("이미 등록된 학생이름입니다.");
        } else {
            students.add(student);
            studentScore.put(student.getName(), score);
            studentCheck.add(student.getName());
            System.out.println("학생을 등록하였습니다");
            System.out.println(printStudents(student));
        }
    }

    public void removeStudent(String delName) {
        Student delStudent = null;
        for (Student each:students){
            if (each.getName().equals(delName)){
                studentCheck.remove(delName);
                studentScore.remove(delName);
                delStudent = each;
                break;
            }
        }
        if (delStudent != null){
            students.remove(delStudent);
            System.out.println(delName+"의 학생이 삭제됐습니다.");
        }else {
            System.out.println(delName+"라는 학생이 존재하지 않습니다.");
        }
    }

    public void printAllStudents() {
        for (Student each:students){
            System.out.println(printStudents(each));
        }
    }

    public void printScore(String searchName) {
        int score = studentScore.get(searchName);
        System.out.println(searchName+"의 점수는 "+score+"입니다.");
    }

    public String printStudents(Student student){
        return String.format("이름: %s, 나이: %s, 학번: %s", student.getName(), student.getAge(), student.getStudentId());
    }
}
