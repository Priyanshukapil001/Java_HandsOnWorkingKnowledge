import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.PrintWriter;
 
public class CoinPiles {
    public static void main(String[] args) throws Exception {
       BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        StringTokenizer st = new StringTokenizer(r.readLine());
 
        int n = Integer.parseInt(st.nextToken());
 
        for(int i = 0; i < n; i++)
        {
            st = new StringTokenizer(r.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
 
            if (a > b)
            {
                if (b * 2 < a)
                {
                    pw.println("NO");
                }
                else if ((a + b) % 3 == 0)
                {
                    pw.println("YES");
                }
                else {
                    pw.println("NO");
                }
            }
            else
            {
                if (a * 2 < b)
                {
                    pw.println("NO");
                }
                else if ((a + b) % 3 == 0)
                {
                    pw.println("YES");
                }
                else {
                    pw.println("NO");
                }
            }
 
        }
 
        pw.close();
    }
}
