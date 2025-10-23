//https://www.inflearn.com/courses/lecture?courseId=330396&tab=curriculum&type=LECTURE&unitId=149971&subtitleLanguage=ko

import java.io.*;
import java.util.*;

public class Main {
    
    public int solution(int[] arr){
        int ans = 0;
        int len = arr.length;
        Queue<Integer> q = new LinkedList<>();
        int[] check = new int[len];

        q.offer(0);
        check[0] = 1;
        
        while(!q.isEmpty()){
            int sz = q.size();
            ans++;
            for(int i = 0; i < sz; i++){
                int cur = q.poll();
                if(cur == (len-1)) return ans-1;
                int dist = arr[cur];
                for(int j = 0; j <= dist; j++){
                    if(cur+j < len && check[cur+j] == 0 ){
                        q.offer(cur+j);
                        check[cur+j] = 1;
                    }
                }
            }       
        }


        return -1;
    }

    public static void main(String[] args) throws IOException{
        Main T = new Main();
        
        int[] arr1 = {2,2,1,2,1,1};
        System.out.println(T.solution(arr1)); 

        int[] arr2 = {1, 0, 1, 1, 3, 1, 2, 1};
        System.out.println(T.solution(arr2));
        
        int[] arr3 = {2, 3, 1, 0, 1, 1, 2, 3, 1, 5, 1, 3, 1};
        System.out.println(T.solution(arr3));

        int[] arr4 = {1, 2, 1, 2, 1, 2, 1, 1, 3, 1, 2, 1};
        System.out.println(T.solution(arr4));

        int[] arr5 = {1, 3, 2, 1, 1, 2, 3, 1, 3, 1, 2, 3, 5, 1, 5, 1, 2, 1, 1};
        System.out.println(T.solution(arr5));
    }   
}
