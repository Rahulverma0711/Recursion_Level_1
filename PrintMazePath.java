import java.util.*;

public class PrintMazePath {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[][] matrix = new int[n][n];

        ArrayList<String> ans = printMazePath(matrix,0,0,n-1,n-1);
        System.out.println(ans);


    }
    static ArrayList<String> printMazePath(int[][]matrix,int sx,int sy,int dx,int dy){
        if(sx==dx && sy==dy){
            ArrayList<String> bres=new ArrayList<>();
            bres.add("");
            return bres;
        }
        if(sx>dx || sy>dy){
            ArrayList<String> bres = new ArrayList<>();
            return bres;
        }
        ArrayList<String> mres = new ArrayList<>();
        ArrayList<String> verticalMove=printMazePath(matrix, sx, sy+1, dx, dy);
        ArrayList<String> horizontalMove=printMazePath(matrix, sx+1, sy, dx, dy);
        for(String vstr:verticalMove){
            mres.add('v'+ vstr);
        }
        for(String hstr:horizontalMove){
            mres.add('h'+ hstr);
        }

        return mres;
    }
    
}
