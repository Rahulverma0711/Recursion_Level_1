
import java.util.*;

public class PrintMazePathWithJumps {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        ArrayList<String> ans = mazePathWithJumps(1, 1, n, n);
        System.out.println(ans);

    }

    public static ArrayList<String> mazePathWithJumps(int sr, int sc , int dr , int dc ){
      
        if(sr==dr && sc==dc){
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }
        ArrayList<String> mres = new ArrayList<>();
        for(int ms=1;ms<=dc-sc;ms++){
            ArrayList<String> rres = mazePathWithJumps(sr,sc+ms,dr,dc);
            for(String path:rres){
                mres.add("h"+ms+path);
            }
        }

        for(int ms=1;ms<=dr-sr;ms++){
            ArrayList<String> rres = mazePathWithJumps(sr+ms,sc, dr, dc);
            for(String path:rres){
                mres.add("v"+ms+path);
            }
        }


        return mres;

      
    }
 
}
