import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class  Tuple{
    int r;
    int c;
    int time;
    public Tuple(int r,int c ,int time){
        this.r = r;
        this.c= c;
        this.time =time;
    }
}
public class ArmyInversion {
public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 int n = sc.nextInt();
 int m = sc.nextInt();
    String[] s = new String[n];
    for(int i = 0; i < n; i++){
        s[i] = sc.next();
    }
    char q[][] = new char[n][m];
    for(int i = 0; i < n; i++){
        for(int j = 0; j < m; j++){
            q[i][j] = s[i].charAt(j);

}
}
System.out.println(dfs(q));

}
public static int dfs(char[][] grid){
    
    int n  = grid.length;
        int m = grid[0].length;
        boolean vis[][]= new boolean[n][m];
        Queue<Tuple> q = new LinkedList<>();
        for(int i =0;i<n;i++){
            for(int j =0;j<m;j++){
                if(grid[i][j] == 'A'){
                    q.offer(new Tuple(i,j,0));
                    vis[i][j] = true;
                }
            }
            
        }
        int reqTime =0;
        int[] delrow= {-1,0,1,0};
        int[] delcol = {0,1,0,-1};
        
        while(!q.isEmpty()){
            Tuple temp = q.poll();
            int row = temp.r;
            int col =temp.c;
            int time = temp.time;
            reqTime = Math.max(reqTime,time);
            for(int i =0;i<4;i++){
                int nrow = delrow[i] + row;
                int ncol = delcol[i] + col;
                if(nrow>=0 && ncol >=0 && nrow<n && ncol<m && grid[nrow][ncol]== 'E' && vis[nrow][ncol]== false){
                    q.offer(new Tuple(nrow,ncol,time+1));
                    vis[nrow][ncol] = true; 
                }
            }
            
        }
        for(int i =0;i<n;i++){
            for(int j =0;j<m;j++){
                if(grid[i][j]== 'E' && vis[i][j] != true ){
                    return -1;
                }
            }
        }
        return reqTime;
    }
}
