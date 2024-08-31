import java.util.*;
public class repetition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        if(str.length() ==1){
            System.out.println(1);
        }
        else{
        long count =1;
        long ans =Long.MIN_VALUE;
        for(int i= 1;i<str.length();i++) {
            if(str.charAt(i) == str.charAt(i-1)){
                count++;
            }
            else{
                ans = Math.max(count,ans);
                count = 1;
            }
            ans = Math.max(count,ans);  
    }
    System.out.println(ans);
}
    }

}