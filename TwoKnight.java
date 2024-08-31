import java.io.*;
import java.util.Scanner;
public class TwoKnight {
    public static void main(String[] args)throws Exception {
       // BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
       Scanner scanner = new Scanner(System.in);
       long n = scanner.nextLong();
        for(int i = 1;i<=n;i++){
            long ways = (long)(i*i)*(i*i-1)/2;
            long attack = 4*(i-1)*(i-2);
        System.out.println(ways-attack);
        }

    }
}
