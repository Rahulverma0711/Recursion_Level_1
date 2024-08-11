import java.util.*;
public class TowerOfHanoi {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        Character toi1= 'A';
        Character toi2= 'B';
        Character toi3= 'C';

        towerOfHanoi(n,toi1,toi2,toi3);
    }
    public static void  towerOfHanoi(int n,Character toi1,Character toi2,Character toi3){
        if(n==0) return;
        towerOfHanoi(n-1,toi1,toi3,toi2);
        System.out.println(n+ "["+ toi1+"->"+toi2);
        towerOfHanoi(n-1, toi3, toi2, toi1);
    }
    
}
