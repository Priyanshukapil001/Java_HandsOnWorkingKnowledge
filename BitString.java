import java.util.Scanner;

public class BitString {
    static long MOD = 1000000007;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextInt();
        System.out.println(power(2,n));
   
}
    public static long power(int b,long n){
        if(n==0){
            return 1;
        }
       long temp = power(b,n/2);
        if(n%2 != 0){
            return (temp*temp*b)%MOD;
        }
        else{
        return (temp*temp)%MOD;
    }
}
}
