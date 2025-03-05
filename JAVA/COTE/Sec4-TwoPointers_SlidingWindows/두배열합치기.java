//https://cote.inflearn.com/contest/10/problem/03-01

import java.util.*;

class Test {
    
    public int[] solutions(int n, int[] arrn, int m, int[] arrm){
        int[] answer = new int[n+m];
      
        int idn = 0, idm = 0, i = 0;
        while(true){
            if(idn >= n && idm >= m){
                break;
            }else if(idn >= n || arrn[idn] >= arrm[idm]){
                answer[i] = arrm[idm]; 
                idm++;
            } else{
                answer[i] = arrn[idn];
                idn++;
            }
            i++;
        }
        
        return answer;    
    }

    public static void main(String[] args){
        Test T = new Test();
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();
        int[] arrn = new int[n];
        for(int i = 0; i < n; i++){
            arrn[i] = in.nextInt();
        }

        int m = in.nextInt();
        int[] arrm = new int[m];
        for(int j = 0; j < m; j++){
            arrm[j] = in.nextInt();
        }

        for(int num : T.solutions(n, arrn, m, arrm)){
            System.out.print(num + " ");
        }
        
        in.close();      
    }
}
