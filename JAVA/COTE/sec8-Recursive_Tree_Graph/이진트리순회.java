
import java.util.*;

class Node{
  int data;
  Node lt, rt; //해당 인스턴스 변수는 노드 객체 주소를 저장한다.
  public Node(int val){
    data = val;
    lt = rt = null;
    }
}

public class Main{
  Node root;
  public void DFS(Node root){
    if(root == null) return;
    else{
      System.out.println(root.data); // 전위 순회
      DFS(root.lt);
      System.out.println(root.data); // 중위 순회
      DFS(root.rt);
      System.out.println(root.data); // 후위 순회 
    }
  
  }
  public static void main(String args){
    Main tree = new Main();
    tree.root = new Node(1);
    root.rt = new Node(2);
    root.lt = new Node(3);
    root.rt.rt = new Node(4);
    root.rt.lt = new Node(5);
    root.lt.rt = new Node(6);
    root.lt.lt = new Node(7);
    tree.DFS(tree.root);
  }
}
