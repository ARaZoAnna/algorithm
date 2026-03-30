import java.io.*;
import java.util.*;



public class Main {
    static int n, m;
    static int[] uf;
    public int find(int v){
      if(v == uf[v]) return v;
      else{
        return uf[v] = find(uf[v]);
      }
    }
    public void union(int a, int b){
      int fa = find(a);
      int fb = find(b);
      if(fa != fb) uf[fa] = fb;
    }
    public static void main(String[] args) throws IOException{
    Main T = new Main();
    //Scanner in=new Scanner(System.in);
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    
    n = Integer.parseInt(st.nextToken());
    m = Integer.parseInt(st.nextToken());

    uf = new int[n+1];
    for(int i = 1; i <= n; i++) uf[i] = i;
    
    for(int i = 0; i < m; i++){
      st = new StringTokenizer(br.readLine());
      int a = Integer.parseInt(st.nextToken());
      int b = Integer.parseInt(st.nextToken());
      T.union(a,b);
    }

    st = new StringTokenizer(br.readLine());
    int a = Integer.parseInt(st.nextToken());
    int b = Integer.parseInt(st.nextToken());
    if(T.find(a) == T.find(b)) System.out.println("YES");
    else System.out.println("NO");
    return ;
  }
}
