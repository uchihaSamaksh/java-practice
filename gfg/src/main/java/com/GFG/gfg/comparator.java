package com.GFG.gfg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class comparator {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("apple");
        list.add("banana");
        list.add("cherry");
        list.add("date");
        list.add("elderberry");
        list.add("fig");
        list.add("grape");
        System.out.println("Original list");
        System.out.println(list);
        System.out.println("Sorting list in natural order");
        list.sort(null);
        System.out.println(list);
        list.sort(new StringLengthComparator());
        System.out.println(list);
        list.sort((a,b)->b.length()-a.length());
        System.out.println("Sorting list in reverse order of length");
        System.out.println("With lambda expression");
        System.out.println(list);
        List<Student> students = new ArrayList<>();

        students.add(new Student(1,"John",20));
        students.add(new Student(2,"Jane",21));
        students.add(new Student(3,"Jim",22));
        System.out.println("Original list of students");
        System.out.println(students);

        Comparator comparator = Comparator.comparing(Student::getAge);
        students.sort(comparator);
        System.out.println("Sorting list of students by age");
        System.out.println(students);

        Comparator comparator2 = Comparator.comparing(Student::getName).reversed();
        students.sort(comparator2);
        System.out.println("Sorting list of students by name in reverse order");
        System.out.println(students);

        Comparator comparator3 = Comparator.comparing(Student::getName).thenComparing(Student::getAge);
        students.sort(comparator3);
        System.out.println("Sorting list of students by name and age");
        System.out.println(students);
    }
    
    
}

class Student implements Comparable<Student>{
    int rollno;
    String name;
    int age;
    Student(int rollno,String name,int age){
        this.rollno=rollno;
        this.name=name;
        this.age=age;
    }
    public String toString(){
        return "Student [rollno=" + rollno + ", name=" + name + ", age=" + age + "]";
    }
    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }

    @Override
    public int compareTo(Student o) {
        return this.age - o.age;
    }
}

class StringLengthComparator implements Comparator<String> {
    @Override
    public int compare(String s1, String s2) {
        return s1.length() - s2.length();
    }

    
}
