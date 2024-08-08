import java.util.*;
public class PowerXN {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int x=scn.nextInt();
        int n=scn.nextInt();

        int xn=powerXn(x,n);
        System.out.println(xn);

    }
    public static int powerXn(int x,int n){
        if(n==0){
            return 1;
        }
        int xnm1=powerXn(x, n-1);
        int xn=x*xnm1;
        return xn;
    }
}
