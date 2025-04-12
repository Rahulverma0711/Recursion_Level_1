import java.util.*;
public class PrintSubsequence1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        printSS(0,str.length(),"",str);
    }

    public static void printSS(int idx, int len, String asf,String str){
        if(idx==len){
            System.out.println(asf);
            return;
        }
        printSS(idx+1,len,asf+str.charAt(idx),str);
        printSS(idx+1,len,asf,str);

    }
}
