import java.util.Scanner;

public class FindMaxArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        int maxi=findMaxArray(arr,n-1);
        System.out.println(maxi);
    }
    public static int findMaxArray(int[] arr, int n){
        if(n==0) return arr[n];
        int max1=findMaxArray(arr, n-1);
        return max1>arr[n]?max1:arr[n];
        
    }
    
}
