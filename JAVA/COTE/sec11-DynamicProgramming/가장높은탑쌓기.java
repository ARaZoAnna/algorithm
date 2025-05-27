//https://cote.inflearn.com/contest/10/problem/10-04

import java.util.*;

class Bricks implements Comparable<Bricks>{
    int area, height, weight;
    
    public Bricks(int area, int height, int weight){
        this.area = area;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public int compareTo(Bricks o){
        return o.area - this.area;
    }
}

class Main {
    static int n, max, answer=0;
    static boolean flag = true;
    static ArrayList<Bricks> lst;
    static int[] dy;
    public void solutions(){
        dy = new int[n];
        dy[0] = lst.get(0).height;
        for(int cur = 1; cur < n; cur++){
            int idx = cur-1;
            flag = true;
            max = Integer.MIN_VALUE;
            while(idx >= 0){
                if(lst.get(cur).weight < lst.get(idx).weight){
                    if(max < dy[idx]) max = dy[idx];
                    flag= false;
                }
                idx--;
            }
            if(flag) dy[cur] = lst.get(cur).height;
            else dy[cur] = lst.get(cur).height + max;
            answer = Math.max(answer, dy[cur]);
        }

    }
    public static void main(String[] args){
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        
        n = in.nextInt();

        lst = new ArrayList<>();
        dy = new int[n];
        int area, height, weight;
        for(int i = 0; i < n; i++){
            area = in.nextInt();
            height = in.nextInt();
            weight = in.nextInt();
            lst.add(new Bricks(area, height, weight));
        }

        Collections.sort(lst);
        T.solutions();
        System.out.println(answer);
    }
}
