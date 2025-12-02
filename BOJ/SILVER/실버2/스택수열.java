//https://www.acmicpc.net/problem/1874

import java.io.*;
import java.util.*;
class Main {
    static ArrayList<Character> ans;
    public Boolean solutions(int[] arr, int n){
        Stack<Integer> stack = new Stack<>();
        ans = new ArrayList<>();

        int target = 0;
        for(int i = 1; i <= n; i++){
            stack.push(i);
            ans.add('+');
            while(!stack.isEmpty()){
                if(stack.peek() < arr[target]) break;
                else if(stack.peek() == arr[target]){
                    stack.pop();
                    target++;
                    ans.add('-');
                }else{
                    return false;
                }
            }

        }
        return true;
    }
    
	public static void main(String[] args) throws IOException{
		Main T = new Main();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine());
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
		if(T.solutions(arr, n)){
            for(char c : ans) System.out.println(c); 
        }else{
            System.out.println("NO");
        }
	}
}
