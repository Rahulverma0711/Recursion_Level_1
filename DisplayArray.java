import java.util.*;
public class DisplayArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        displayArray(arr,n-1);

    }
    public static void displayArray(int []arr, int n){
        if(n==-1) return;
        displayArray(arr, n-1);
        System.out.println(arr[n]);
    }
    
}
