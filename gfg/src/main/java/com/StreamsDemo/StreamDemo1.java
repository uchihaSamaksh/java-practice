package com.StreamsDemo;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

import com.GFG.gfg.StudentModelClass;

public class StreamDemo1 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        list.stream().filter(i -> i%2 == 0).forEach(System.out::println);

        System.out.println(list);

        //Lambda expression
        MathOperation sum = (a,b) -> a+b;
        MathOperation sub = (a,b) -> a-b;

        System.out.println(sum.operation(1,2));
        System.out.println(sub.operation(1,2));

        //Predicate
        Predicate<Integer> isEven = (i) -> i%2 == 0;
        System.out.println(isEven.test(10));

        Predicate<StudentModelClass> isStudentOlderThan18 = s -> s.getAge() > 18;
        StudentModelClass student = new StudentModelClass("John",20,"New York","1234567890");
        StudentModelClass student2 = new StudentModelClass("Jane",17,"Los Angeles","1234567891");
        System.out.println(isStudentOlderThan18.test(student));
        System.out.println(isStudentOlderThan18.test(student2));

        //Function
        Function<StudentModelClass, StudentModelClass> studentFunctionToAddEligiblity = (s) -> {
            if(s.getAge() > 18){
                s.setEligiblity("Eligible");
            }else{
                s.setEligiblity("Not Eligible");
            }
            return s;
        };

        student = studentFunctionToAddEligiblity.apply(student);
        student2 = studentFunctionToAddEligiblity.apply(student2);
        System.out.println(student.toString());
        System.out.println(student2.toString());

        //Consumer
        Consumer<StudentModelClass> printStudent = (s) -> System.out.println(s.toString());
        printStudent.accept(student);
        printStudent.accept(student2);

        //Supplier
        Supplier<StudentModelClass> studentSupplier = () -> {
            return new StudentModelClass("John",20,"New York","1234567890");
        };
        System.out.println(studentSupplier.get().toString());

        Predicate<Integer> isEvenPredicate = (x) -> x%2 == 0;
        Function<Integer,Integer> squareFunction = x -> x*2;
        Function<Integer,Integer> divideByTwo  = x->x/2;
        Consumer<Integer> printConsumer = x -> System.out.println(x);
        Supplier<Integer> giveRandomNumber = () -> 100;

        if(isEvenPredicate.test(giveRandomNumber.get())){
            printConsumer.accept(squareFunction.apply(giveRandomNumber.get()));
        }

        //Method reference
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);
        numbers.forEach(System.out::print);

        //Constructor reference
        List<String> names = Arrays.asList("John","Jane","Jim","Jill");
        names.stream().map(StudentModelClass::new).forEach(System.out::println);


        

    }

    public static Integer square(Integer x){
        return x*x;
    }

    @FunctionalInterface
    interface MathOperation{
        public int operation(int a, int b);
         
    }
}
