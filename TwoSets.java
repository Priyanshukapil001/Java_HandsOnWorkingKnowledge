import java.util.*;
public class TwoSets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
          long n = scanner.nextLong();
          long target = n*(n+1)/2;
           if(target %2 != 0){
            System.out.println("NO");
           }
           else{
               System.out.println("YES");
               boolean flag = false;
            ArrayList<Long> a = new ArrayList<Long>();
            ArrayList<Long> b = new ArrayList<Long>();
                  a.add(n--);
                if(n%2==0){
                for(int i =1 ;i<n/2;i += 2){
                    b.add((long)i);
                b.add(n-i+1);
            }
            for(int i = 2;i<=n/2; i+=2 ){
                a.add((long)i);
                a.add(n-i+1);
            }
            flag = true;
           }
           else{
                 for(int i =1 ;i<n/2;i += 2){
                a.add((long)i);
                a.add(n-i+1);
            }
            for(int i = 2;i<=n/2;i+=2 ){
                b.add((long)i);
                b.add(n-i+1);
            }
            flag = false;
           }
           System.out.println(a.size());
           for(long i : a){
            System.out.print(i+" ");
           }
           System.out.println();
           System.out.println(b.size());
           for(long i : b){
               System.out.print(i+" ");
            }
        }

    }
}