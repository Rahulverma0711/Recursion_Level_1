import java.util.ArrayList;
import java.util.Scanner;

public class PrintMazePathWithJumps {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[][] matrix = new int[n][n];

        ArrayList<String> ans = printMazePathWithJumps(matrix,0,0,n-1,n-1,"");
        System.out.println(ans);
    }
    public static ArrayList<String> printMazePathWithJumps(int matrix[][],int sx, int sy, int dx,int dy,String psf){
        
    }
}
