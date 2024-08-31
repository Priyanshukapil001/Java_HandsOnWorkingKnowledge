 import java.util.*;
 public class Apple{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    int  n = sc.nextInt();
        long arr[]  = new long[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        long sum1 = 0;
        long sum2 = 0;
         long x = solve(arr,0,n,sum1,sum2);
        System.out.print(x+" ");
    }
    public static long solve(long arr[], int ind, int n  ,long  sum1, long sum2){
        if(ind == n){
            return (long)Math.abs(sum1-sum2);
        }
        long l = solve(arr, ind+1,n,sum1+arr[ind],sum2);
        long r = solve(arr, ind+1,n,sum1,sum2+arr[ind]);
        return (long)Math.min(l,r);
    }
}