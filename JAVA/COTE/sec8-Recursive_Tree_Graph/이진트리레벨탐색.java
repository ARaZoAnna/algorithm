import java.util.*;

class Node(){
  int date;
  int lt, rt;
  public Node(int val){
    data = val;
    lt = rt = null;
  }
}

public class Main{
  Node root;
  public void BFS(Node root){
    Queue<Node> Q = new LinkedList<>();
    Q.offer(root);
    int level = 0;
    while(!Q.isEmpty()){
      int len = Q.size();
      System.out.print(level + " : ");
      for(int i = 0; i < len; i++){
        Node cur = Q.poll();
        System.out.println(cur.data + " ");
        if(cur.lt != null) Q.offer(cur.lt);
        if(cur.rt != null) Q.offer(cur.rt);
      }
      lever++;
      System.out.println();
    }
  }

  public static void main(String args[]){
    Main tree = new Main();
    tree.root = new Node(1);
    tree.root.lt = new Node(2);
    tree.root.rt = new Node(3);
    tree.root.lt.lt = new Node(4);
    tree.root.lt.rt = new Node(5);
    tree.root.rt.lt = new Node(6);
    tree.root.rt.rt = new Node(7);
    tree.BFS(tree.root);
  }
}
