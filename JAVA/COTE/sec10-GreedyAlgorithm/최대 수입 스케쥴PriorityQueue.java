//https://cote.inflearn.com/contest/10/problem/09-04
//우선순위 큐 

import java.util.*;

class Pair implements Comparable<Pair>{
    int money, day;
    Pair(int money, int day){
        this.money = money;
        this.day = day;
    }

    @Override
    public int compareTo(Pair o){
        return o.day - this.day;
    }
}

class Main {
    static int n, max = Integer.MIN_VALUE;
    static ArrayList<Pair> arr = new ArrayList<>();
    
    public int solutions(){
        int answer = 0;
        Collections.sort(arr);
        //우선순위 큐
        PriorityQueue<Integer> pQ = new PriorityQueue<>(Collections.reverseOrder());
        int idx = 0;
        for(int cur = max; cur > 0; cur-- ){
            for( ; idx < n; idx++){
                if(arr.get(idx).day < cur) break;
                pQ.offer(arr.get(idx).money);
            }
            if(!pQ.isEmpty()) answer += pQ.poll();
           
        }
        return answer;
    }
    public static void main(String[] args){
        Main T = new Main();
        Scanner in = new Scanner(System.in);

        n = in.nextInt();
        for(int i = 0; i < n; i++){
            int m = in.nextInt();
            int d = in.nextInt();
            arr.add(new Pair(m, d));
            if(max < d) max = d;
        }
        System.out.println(T.solutions());
    }
}
