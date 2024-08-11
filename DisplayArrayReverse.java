import java.util.Scanner;

public class DisplayArrayReverse {
        public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        displayArrayReverse(arr,n-1);

    }
    public static void displayArrayReverse(int[] arr,int n){
        if(n==-1) return;
        System.out.println(arr[n]);
        displayArrayReverse(arr,n-1);
    }
    
}
