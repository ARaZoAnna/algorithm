//https://www.acmicpc.net/problem/11003

import java.io.*;
import java.util.*;

class Node{
  int num, idx;

  Node(int num, int idx){
    this.num = num;
    this.idx = idx;
  }
}

public class Main {
    public static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws IOException{
    Main T = new Main();
    //Scanner in=new Scanner(System.in);
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st = new StringTokenizer(br.readLine());
    
    int n = Integer.parseInt(st.nextToken());
    int l = Integer.parseInt(st.nextToken());
    int[] arr = new int[n];
    int[] ans = new int[n];

    st = new StringTokenizer(br.readLine());
    for(int i = 0; i < n; i++){
      arr[i] = Integer.parseInt(st.nextToken());
    }
    
    Deque<Node> dq = new LinkedList<>();
    int lp = 0;
    for(int rp = 0; rp < n; rp++){
      while(!dq.isEmpty()&&dq.peekLast().num > arr[rp]){
        dq.pollLast();
      }
      dq.offerLast(new Node(arr[rp], rp));
      if(dq.peekFirst().idx < rp - l + 1 ) {
        dq.pollFirst();
        lp++;
      }
      bw.write(dq.getFirst().num+ " ");
    }

    bw.flush();
    bw.close();
    return ;
  }
}
