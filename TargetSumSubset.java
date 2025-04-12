import java.util.*;
public class TargetSumSubset {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[]=new int[n];
        for(int i =0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        int target = scn.nextInt();
        ArrayList<Integer> asf = new ArrayList<>();
        printTargetSumSubset(0,0,asf,target,arr,n);
    }

    public static void printTargetSumSubset(int idx,int sum, ArrayList<Integer> asf,int target, int [] arr,int n){
       if(idx==n){
        if(sum==target){
            System.out.println(asf);
        }
        return;
       }
       sum+=arr[idx];
       asf.add(arr[idx]);
       printTargetSumSubset(idx+1, sum, asf, target, arr, n);
       sum-=arr[idx];
       asf.remove(asf.size()-1);
       printTargetSumSubset(idx+1, sum, asf, target, arr, n);
    }
}
