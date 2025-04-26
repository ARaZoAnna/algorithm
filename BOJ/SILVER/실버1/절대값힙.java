//https://www.acmicpc.net/problem/11286
//우선순위 큐 공부

import java.io.IOException;
import java.io.*;
import java.util.*;


class Main {

    public static void main(String[] args) throws IOException{
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        //우선순위 큐 선언
        PriorityQueue<Integer> myQueue = new PriorityQueue<>((o1,o2)->{
        int a = Math.abs(o1);
        int b = Math.abs(o2);
        //절대값이 같은 경우 음수 우선
        if(a == b) return o1 > o2 ? 1 : -1;
        //절대값이 작은 데이터 우선
        return a - b;
        });

        for(int i = 0; i < n; i++){
            int request = Integer.parseInt(br.readLine());
            if(request == 0){
                if(myQueue.isEmpty()) System.out.println("0");
                else System.out.println(myQueue.poll());
            }else myQueue.add(request);
        }
    }
}
