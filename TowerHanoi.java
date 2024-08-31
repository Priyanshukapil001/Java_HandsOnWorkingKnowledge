import java.util.*;

public class TowerHanoi {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     System.out.println((int)Math.pow(2, n)-1);
     int count = 0;
     solve(n,'1','2','3');
    }

    public static void solve(int n, char A, char B, char C){
        if(n==0){
            return;
        }
        solve(n-1,A,C,B);
        System.out.println(A+" "+C);
         solve(n-1,B,A,C);
        return ;
    }
}
