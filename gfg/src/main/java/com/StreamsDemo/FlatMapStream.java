package com.StreamsDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.GFG.gfg.StudentModelClass;

public class FlatMapStream {
    public static void main(String[] args) {
        List<StudentModelClass> students = new ArrayList<>();
        students.add(new StudentModelClass("John", 20, "New York", "1234567890", Arrays.asList("1234567890", "1234567891")));
        students.add(new StudentModelClass("Jane", 21, "Los Angeles", "1234567891", Arrays.asList("1234567892", "1234567893")));
        students.add(new StudentModelClass("Jim", 22, "Chicago", "1234567892", Arrays.asList("1234567894", "1234567895")));

        List<String> phones = students.stream().flatMap(s->s.getPhones().stream().map(p->"+91-".concat(p.toString()))).toList();
        System.out.println(phones);
        
    }
}
