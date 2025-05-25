//https://cote.inflearn.com/contest/10/problem/10-01

//재귀함수를 이용한 구현 방식
//1. 해당 방식은 자기 자신을 호출하는 함수를 호출하여 계산을 하여 반환을 하는 방식입니다.
//- 재귀 알고리즘으로 구현하는 경우는, 불필요하게 같은 값을 다시 계산하게 되어 계산 속도가 엄청 느리다는 단점이 있습니다.
//- 이를 위해 실제로 구현할 때는 한 번 계산한 값을 저장해 두고 재 계산하지 않는 메모라이제이션 기법을 사용하여 구현해야 합니다.
import java.util.*;

class Main {
    static int n;
    public int DFS(int n){
        if(n <= 2){
            return n;
        }else{
            return DFS(n-1) + DFS(n-2);
        }
    }
    public static void main(String[] args){
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        
        n = in.nextInt();
        dy = new int[n+1];
        System.out.println(T.DFS(n));
        

    }
}

//동적계획법을 활용한 구현 방식
//동적 계획법(Dynamic Programming)이란?
//- 복잡한 문제를 간단한 하위 문제로 나누어 푸는 방법입니다. 이전에 계산한 값을 저장하고 재활용함으로써 중복 계산을 줄이는 특징이 있습니다. 
//  이 방법은 피보나치 수열 계산뿐만 아니라, 최단 경로, 최장 공통부분 문자열 등 다양한 분야에서 사용됩니다.

import java.util.*;

class Main {
    static int n;
    static int[] dy;
    public int DFS(int n){
        dy[1] = 1;
        dy[2] = 2;
        for(int i = 3; i <= n; i++){
            dy[i] = dy[i-1] + dy[i-2];
        }
        return dy[n];
    }
    public static void main(String[] args){
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        
        n = in.nextInt();
        dy = new int[n+1];
        System.out.println(T.DFS(n));
        

    }
}
