package main.java.com.DSAProblems;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class findNamesThatStartWithVowels {
    public static void main(String[] args) {
        String[] names = {"Alice", "Bob", "Charlie", "David", "Eve", "Frank", "Grace", "Hank", "Ivy", "Jack"};
        List<String> namesThatStartWithVowels = Arrays.stream(names).filter(name -> name.charAt(0) == 'A' || name.charAt(0) == 'e' || name.charAt(0) == 'i' || name.charAt(0) == 'o' || name.charAt(0) == 'u').collect(Collectors.toList());
        System.out.println(namesThatStartWithVowels);
    }
}
