import java.util.*;

public class PrintPermutation {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
       printPermutation(str,"");
       

    }
    public static void printPermutation(String str, String asf){
        
        if(str.length()==0){
            System.out.println(asf);
            return;
        }

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            String ros = str.substring(0, i);
            ros= ros+str.substring(i+1);
            printPermutation(ros, asf+ch);

        }
    }
}
