//https://www.inflearn.com/courses/lecture?courseId=330396&type=LECTURE&unitId=149929&tab=curriculum&subtitleLanguage=ko

import java.io.*;
import java.util.*;


class Pair implements Comparable<Pair>{
    int num;
    int one;

    Pair(int num, int one){
        this.num = num;
        this.one = one;
    }

    @Override
    public int compareTo(Pair o){
        if(this.one == o.one) return this.num - o.num;
        return this.one - o.one;
    }
}

public class Main {
    public int binary(int n){
        int cnt = 0;
        int a = n;
        int b = 0;

        while(a > 0){
            b = a % 2;
            a = a / 2;
            if(b == 1) cnt++;
            
        }
        return cnt;
    }

    public int[] solution(int[] arr){
        int len = arr.length;
        int[] ans = new int[len];
        ArrayList<Pair> list = new ArrayList<>();

        int cnt = 0;
        for(int i = 0; i < len; i++){
            cnt = binary(arr[i]);
            list.add(new Pair(arr[i], cnt));
        }
        Collections.sort(list);

        for(int i = 0; i < len; i++){
            ans[i] = list.get(i).num;
        }

        return ans;
    }


    public static void main(String[] args) throws IOException{
        Main T = new Main();
        int[] ans;
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr1 = {5,6,7,8,9};
        ans = T.solution(arr1);
        for(int a : ans) System.out.print(a + " ");
        System.out.println();
        int[] arr2 = {5,4,3,2,1};
        ans = T.solution(arr2);
        for(int a : ans) System.out.print(a + " ");
        System.out.println();
        int[] arr3 = {12,5,7,23,45,21,17};
        ans = T.solution(arr3);
        for(int a : ans) System.out.print(a + " ");
        System.out.println();

    }   
}
