import java.util.Scanner;

public class LastOccurrence {
    public static void main(String[] args) {
         Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        int target=scn.nextInt();
        int fo=lastOccurrence(arr,0,n,target);
        System.out.println(fo);
    }

    public static int lastOccurrence(int[]arr,int start, int n,int target){
        if(start==n) return -1;
        int loisa=lastOccurrence(arr, start+1, n , target);
        if(loisa==-1){
            if(arr[start]==target) return start;
            else return -1;
        }else{
            return loisa;
        }

        
    }
    
}
