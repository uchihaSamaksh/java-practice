package main.java.com.DSAProblems;

public class ReverseNumber {

    public static void main(String[] args) {
        int n = 12345;
        int reversedNumber = 0;

        while(n>0){
            reversedNumber = reversedNumber*10 +n%10;
            n = n/10;
        }
        
        System.out.println(reversedNumber); // Output the reversed number
    }
}
