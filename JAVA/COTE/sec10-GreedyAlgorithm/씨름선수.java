//https://cote.inflearn.com/contest/10/problem/09-01

import java.util.*;

class Point implements Comparable<Point>{
    public int h, w;
    Point(int h, int w){
        this.h = h;
        this.w = w;
    }
    @Override
    public int compareTo(Point o){ //내림차순
        if(this.h == o.h) return o.w - this.w;
        else return o.h - this.h;
    }
}

class Main {
    static int n, cnt = 0;
    static ArrayList<Point> arr;
    public void solutions(){
        int max = Integer.MIN_VALUE;
        for(Point p : arr){
            if(p.w > max){
                cnt++;
                max = p.w;
            }
        }
    }
    
    public static void main(String[] args){
        Main T = new Main();
        Scanner in = new Scanner(System.in);

        n = in.nextInt();
        arr = new ArrayList<Point>();
        for(int i = 0; i < n; i++){
            int height = in.nextInt();
            int weight = in.nextInt();
            arr.add(new Point(height, weight));
        }
        Collections.sort(arr);
        T.solutions();
        System.out.println(cnt);
    }
}
