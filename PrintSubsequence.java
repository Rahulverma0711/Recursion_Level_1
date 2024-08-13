import java.util.*;

public class PrintSubsequence {
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        String str=scn.next();
        ArrayList<String> res=getSubsequence(str);
        System.out.println(res);

    }
    public static ArrayList<String> getSubsequence(String str){
        if(str.length()==0){
            ArrayList<String> bres= new ArrayList<>();
            bres.add("");
            return bres;
        }
        char ch=str.charAt(0);
        String ros=str.substring(1);
        ArrayList<String> rres=getSubsequence(ros);
        ArrayList<String> mres=new ArrayList<>();
        for(String rstr:rres){
            mres.add("_"+ rstr);
        }
        for(String rstr:rres){
            mres.add(ch + rstr);
        }
        return mres;

    }
    
}
