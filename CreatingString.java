import java.util.*;
public class CreatingString {
    static  int count =0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        TreeSet<String> set = new TreeSet<String>();
        solve(str," ",set);
        System.out.println(set.size());
        for(String s: set) System.out.println(s);
    }
    public static void solve(String str,String ans,TreeSet<String> set) {
        if(str.length()==0){
            if(!set.contains(ans)){
                set.add(ans);
            }
            return ;
        }

        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            String ros =str.substring(0,i)+ str.substring(i+1);
            //  System.out.println(ros+" ");
            solve(ros,ans+ch,set);
        }
        return;
    }
}
