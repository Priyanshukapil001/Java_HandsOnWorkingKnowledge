import java.util.ArrayList;
import java.util.Scanner;

public class WeiridAlogrithm {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
      //  ArrayList<Integer> list = new ArrayList<>();
      while(x > 1){
        System.out.print(x+" ");
        if(x%2==0){
            x /= 2;
        }   
        else{
            x = (3*x)+1;
        }
    }
    System.out.print(1);
}
    
}
