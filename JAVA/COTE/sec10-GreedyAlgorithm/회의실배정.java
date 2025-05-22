//https://cote.inflearn.com/contest/10/problem/09-02
//좌표정렬 Comparable

import java.util.*;

class Point implements Comparable<Point>{
    int start, end;
    Point(int start, int end){
        this.start = start;
        this.end = end;
    }
    @Override
    public int compareTo(Point o){
        if(this.end == o.end) return this.start - o.start;
        else return this.end - o.end;
    }
    
}

class Main {
    static int n, answer = 0;
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
        
        int cur = Integer.MIN_VALUE;
        for(Point p : arr){
            if(cur <= p.start && cur <= p.end){
                answer++;
                cur = p.end;
            }
        }
        System.out.println(answer);
    }
}
