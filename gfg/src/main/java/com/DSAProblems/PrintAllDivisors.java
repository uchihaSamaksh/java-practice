package main.java.com.DSAProblems;

public class PrintAllDivisors {

    public static void main(String[] args) {
        int n = 120;
        // for(int i = 1; i <= n; i++){
        //     if(n%i == 0){
        //         System.out.println(i);
        //     }
        // }

        int rootN = (int)Math.sqrt(n);
        for(int i = 1; i <= rootN; i++) {
            if (n % i == 0) {
                System.out.println(i);
                if (i != n / i) {
                    System.out.println(n / i);
                }
            }
        }
    }
}
