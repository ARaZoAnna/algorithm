//https://cote.inflearn.com/contest/10/problem/09-03

import java.util.*;

class Point implements Comparable<Point>{
    int start, end;
    Point(int start, int end){
        this.start = start;
        this.end = end;
    }
    @Override
    public int compareTo(Point o){
        if(this.start == o.start) return this.end - o.end;
        else return this.start - o.start;
    }
    
}

class Main {
    static int n, cnt, max = Integer.MIN_VALUE;
    static ArrayList<Point> arr = new ArrayList<>();
    public static void main(String[] args){
        Main T = new Main();
        Scanner in = new Scanner(System.in);

        n = in.nextInt();
        for(int i = 0; i < n; i++){
            int s = in.nextInt();
            int e = in.nextInt();
            arr.add(new Point(s,e));
        }
        Collections.sort(arr);
        
        for(int cur = 0; cur <= 72; cur++){
            cnt = 0;
            for(Point p : arr){
                if(p.start <= cur && cur < p.end) cnt++;
            }
            if(max < cnt) max = cnt;
        }
        System.out.println(max);
    }
}
