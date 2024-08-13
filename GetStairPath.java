import java.util.*;

public class GetStairPath {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        ArrayList<String> ans= getStairPath(n);
        System.out.println(ans);
    }
    static ArrayList<String> getStairPath(int n){
        if(n==0){
            ArrayList<String> bres=new ArrayList<>();
            bres.add("");
            return bres;
        }
        if(n<0){
            ArrayList<String> bres = new ArrayList<>();
            return bres;
        }
        ArrayList<String> paths1=getStairPath(n-1);
        ArrayList<String> paths2=getStairPath(n-2);
        ArrayList<String> paths3=getStairPath(n-3);
        ArrayList<String> mres=new ArrayList<>();
        for(String rstr:paths1){
            mres.add('1'+rstr);
        }
        for(String rstr:paths2){
            mres.add('2'+rstr);
        }
        for(String rstr:paths3){
            mres.add('3'+rstr);
        }
        return mres;

    }
    
}
