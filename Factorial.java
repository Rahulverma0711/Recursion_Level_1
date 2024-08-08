import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        int fact = factorial(n);
        System.out.println(fact);
    }
    public static int factorial(int n){
        if(n==1) return 1;
        int factMinusOne=factorial(n-1);
        return n*factMinusOne;
    }
    
}
