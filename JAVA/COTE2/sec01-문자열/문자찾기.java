//https://cote.inflearn.com/contest/10/problem/01-01

import java.util.Scanner;
  
public class Main {
  public static void main(String[] args){
    Scanner in=new Scanner(System.in);
    String input1 = in.next().toLowerCase();
    char input2 = in.next().toLowerCase().charAt(0);
    
    int cnt = 0;
    for(int i = 0; i < input1.length(); i++){
     	if(input1.charAt(i) == input2) cnt++; 
    }
    System.out.println(cnt);
    return ;
  }
}
