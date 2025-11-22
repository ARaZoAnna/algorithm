//https://www.acmicpc.net/problem/17609

import java.io.*;
import java.util.*;
class Main {
    public boolean isPal(String str, int lt, int rt){
        while(lt < rt){
            if(str.charAt(lt) != str.charAt(rt)){
                return false;
            }
            lt++;
            rt--;
        }
        return true;
    }
	public static void main(String[] args) throws IOException{
		Main T = new Main();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int t = Integer.parseInt(st.nextToken());
        
        for(int i = 0; i < t; i++){
            st = new StringTokenizer(br.readLine());
            String str = st.nextToken();
            int answer = 0; // 0: 회문, 1: 유사회문, 2: 그외
            
            int lt = 0;
            int rt = str.length()-1;
            while(lt < rt){
                //System.out.println("l: " + lt + " r: " +rt);
                if(str.charAt(lt) != str.charAt(rt)){
                    if(T.isPal(str, lt+1, rt) || T.isPal(str, lt, rt-1)){
                        answer = 1;
                    }else{
                        answer = 2;
                    }
                    break;
                }
                lt++;
                rt--;
            }
            System.out.println(answer);
        }

        
		
	}
}
