package com.GFG.gfg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableSort {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1,"John",20));
        students.add(new Student(2,"Jane",21));
        students.add(new Student(3,"Jim",18));
        System.out.println(students);

        Collections.sort(students);
        System.out.println(students);
    }
}
