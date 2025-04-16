//스택 프레임(Stack Frame) : 함수가 호출되면 사용하는 스택 영역
//재귀는 스택 프레임 구조를 가지고 있다. 


import java.util.*;
class Main{
  public void DFS(int n){
    if(n == 0) return;
    else{
      DFS(n/2);
      System.out.println(n%2 + " ");
    }
  }

  public static void main(String[] args){
    Main T = new Main();
    T.DFS(11);
  }
}
