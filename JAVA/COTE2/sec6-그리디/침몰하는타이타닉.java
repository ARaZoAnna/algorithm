//https://www.inflearn.com/courses/lecture?courseId=330396&tab=curriculum&type=LECTURE&unitId=149942&subtitleLanguage=ko

import java.io.*;
import java.util.*;


public class Main {
    public int solution(int[] arr, int m){
        int cnt = 0;
        Arrays.sort(arr);
        int rt = arr.length-1;
        int lt = 0;
        while(lt < rt){
            if(arr[lt] + arr[rt] > m){
                cnt++;
                rt--;
            }else{
                cnt++;
                lt++;
                rt--;
            }
        }
        return cnt;
    }


    public static void main(String[] args) throws IOException{
        Main T = new Main();
        
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //StringTokenizer st = new StringTokenizer(br.readLine());
        
        int m = 0;

        int[] arr1 = {90, 50, 70, 100, 60};
        m = 140;
        System.out.println(T.solution(arr1, m)); 
        int[] arr2 = {86, 95, 107, 67, 38, 49, 116, 22, 78, 53};
        m = 150;
        System.out.println(T.solution(arr2, m));
        int[] arr3 = {68,72,30,105,55,115,36,67,119,111,95,24,25,80,55,85,75,83,21,81};
        m = 120;
        System.out.println(T.solution(arr3, m));

    }   
}
