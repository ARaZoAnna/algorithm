import java.util.*;

class Node{
  int data;
  Node lt, rt;
  public Node(int val){
    data = val;
    lt = rt = null;
  }
}

class Main{
  Node root = new Node();
  
  public int BFS(Node root){
    Queue<Node> que = new LinkedList<>();
    que.offer(root);
    int level = 0;
    while(!que.isEmpty()){
      int len = que.size();
      for(int i = 0; i < len; i++){
        Node cur = que.poll();
        if(tmp.lt == null & tmp.rt == null) return level;
        if(tmp.lt != null) que.offer(tmp.lt);
        if(tmp.rt != null) que.offer(tmp.rt); 
      }
      level++;
    }
    return 0;
  }
  
  class static void main(String args[]){
    Main tree = new Main();
    tree.root = new Node(1);
    tree.root.lt = new Node(2);
    tree.root.rt = new Node(3);
    tree.root.lt.lt = new Node(4);
    tree.root.lt.rt = new Node(5);
    System.out.println(tree.BFS(tree.root));
  }
}
