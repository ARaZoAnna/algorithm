//https://cote.inflearn.com/contest/10/problem/05-08

import java.util.*;

class Pair { //map이나 배열을 만들어 넣지 않고 class를 만든다.
    int idx, emergency;
    public Pair(int idx, int emergency){
        this.idx = idx;
        this.emergency = emergency;
    }
   }

class Test {

    
    public int solutions(int n, int k, int[] arr){
       int answer = 0; 

       Queue<Pair> que = new LinkedList<>();
       for(int i = 0; i < n; i++){
        que.offer(new Pair(i, arr[i]));
       }

       while(!que.isEmpty()){
        Pair cur = que.poll();
        
        for(Pair tmp : que){
            if(cur.emergency < tmp.emergency){
                que.offer(cur);
                cur = null;
                break;
            }
        }
        if(cur != null){
            answer++;
            if(cur.idx == k) break;
        }
    
        }
       


        return answer;    
    }

    public static void main(String[] args){
        Test T = new Test();
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();
        int k = in.nextInt();

        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = in.nextInt();
        }

        System.out.println(T.solutions(n, k, arr));
        
        in.close();      
    }
}
