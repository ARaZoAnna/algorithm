//https://www.inflearn.com/courses/lecture?courseId=326750&type=LECTURE&unitId=73396&tab=curriculum&subtitleLanguage=ko


import java.util.*;


class Main {
    static int[] arr;
    static int total = 0, n;
    static String answer = "NO";
    static boolean flag = false;

    public void DFS(int sum, int idx){
        if(flag) return;
        if(sum > total/2)  return;
        if(idx == n){
            if(sum == (total - sum)){
                flag = true;
                answer = "YES";
            }
        }
        else{
            DFS(sum+arr[idx], idx++);
            DFS(sum, idx++);
        }
    }

    public static void main(String[] args){
        Main T = new Main();
        Scanner in = new Scanner(System.in);

        n = in.nextInt();
        
        arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = in.nextInt();
            total += arr[i];
        }
        T.DFS(0,0);
        System.out.println(answer);

    }
}
