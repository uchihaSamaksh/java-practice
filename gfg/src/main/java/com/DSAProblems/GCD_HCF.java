package main.java.com.DSAProblems;

public class GCD_HCF {
    public static void main(String[] args) {
        int a = 120;
        int b = 150;
        int gcd = gcd(a, b);
        int gcd2 = gcd2(a, b);
        System.out.println(gcd);
        System.out.println(gcd2);
    }
    
    public static int gcd(int a, int b){
        for(int i = Math.min(a, b); i > 0; i--){
            if(a%i == 0 && b%i == 0){
                return i;
            }
        }
        return 1;
    }

    public static int gcd2(int a, int b){
        //Euclidean Algorithm
        if(b <= 0){
            return a;
        }
        else if(a <= 0){
            return b;
        }
        else{
            return gcd2(Math.max(a, b)- Math.min(a, b), Math.min(a, b));
        }
    }
}
