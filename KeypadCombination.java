import java.util.*;

public class KeypadCombination {
    static String keypad[]={".","?","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz",};
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String code=scn.next();
        ArrayList<String> ans = getKeypadCombination(code);
        System.out.println(ans);

    }
    static ArrayList<String> getKeypadCombination(String code){
        if(code.length()==0){
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }
        char ch = code.charAt(0);
        String roc=code.substring(1);
        ArrayList<String> rres = getKeypadCombination(roc);
        ArrayList<String> mres=new ArrayList<>();
        String codeAtKey = keypad[ch-'0'];
        for(int i=0;i<codeAtKey.length();i++){
            char x = codeAtKey.charAt(i);

            for(String mstr: rres){
                mres.add(x + mstr);
            }
        }
        return mres;
    }
    
}
