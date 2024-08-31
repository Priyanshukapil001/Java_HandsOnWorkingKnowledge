import java.util.Scanner;

public class TraillingZeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        long n = scanner.nextLong();
        long count = 0;
        for(int i = 5; n/i>= 1; i *= 5) {
            count += n/i;
          }
          System.out.println(count);
    }
}